package net.guillaume.tools.tvu;

import net.guillaume.commons.io.Wget;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Guillaume
 */
public class LinkExtractor {

    public List<String> getEdonkeyLinksFor(String url) throws IOException {

        String indexPage = Wget.getPage(url);

        String linksPage = getLinksPage(indexPage);

        return extractEdonkeyLinksFrom(linksPage);
    }

    private String getLinksPage(String indexPage) {

        // todo

        return "";
    }

    private List<String> extractEdonkeyLinksFrom(String linksPage) {

        // todo

        return new ArrayList<String>();
    }

}
