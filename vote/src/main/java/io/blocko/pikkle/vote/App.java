/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.blocko.pikkle.vote;

import io.blocko.pikkle.common.LinkedList;

import static io.blocko.pikkle.common.utilities.StringUtils.join;
import static io.blocko.pikkle.common.utilities.StringUtils.split;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(MessageUtils.getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
