
package net.guillaume.tools.tvu;

import org.junit.Test;

import java.io.IOException;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @Author : Guillaume
 */
public class LinkExtractorTest {

    @Test
    public void shouldReturnEdonkeyLinks() throws IOException {
        assertThat(new LinkExtractor().getEdonkeyLinksFor("http://tvu.org.ru/index.php?show=episodes&sid=60290"))
                .contains("ed2k://|file|Game.Of.Thrones.3x02.Dark.Wings,.Dark.Words.720p.HDTV.x264-IMMERSE.[tvu.org.ru].mkv|1779610031|DAB2FD4F1A05988C8E20B2414147AA07|h=6DWRCBNOWIGJXKZ2GKSB4N7UHN3CJA3Q|/",
                        "ed2k://|file|Game.Of.Thrones.3x01.Valar.Dohaeris.REPACK.720p.HDTV.x264-EVOLVE.[tvu.org.ru].mkv|1398402741|8E950E47D148C38B8D4896BD1F6973B4|h=RGGJ57WUYOLPSQS6NRT533G5D4CJHLXP|/",
                        "ed2k://|file|Game.Of.Thrones.S03.Special.-.A.Gathering.Storm.720p.HDTV.x264-BTN.[tvu.org.ru].mkv|413283660|2B3232D2CCCE15B7884D666BC1497D4A|h=VQQ4LP3AHREHG6HNYJKKDNL3YWZ4B6CH|/");
    }

}
