/*
* generated by Xtext
*/
package org.eclipse.fx.ide.css.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CssDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.tokens");
	}
}
