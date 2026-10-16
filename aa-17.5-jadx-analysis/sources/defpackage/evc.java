package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class evc {
    private static final ThreadLocal a = new ThreadLocal();
    private final Context b;
    private final evq c;

    public evc(Context context, evq evqVar) {
        evqVar.getClass();
        this.b = context;
        this.c = evqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0286, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.euz b(android.content.res.Resources r19, android.content.res.XmlResourceParser r20, android.util.AttributeSet r21, int r22) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):euz");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.euo c(android.content.res.TypedArray r13, android.content.res.Resources r14, int r15) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.c(android.content.res.TypedArray, android.content.res.Resources, int):euo");
    }

    public final eva a(int i) throws Resources.NotFoundException {
        int next;
        Resources resources = this.b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        resources.getClass();
                        attributeSetAsAttributeSet.getClass();
                        euz euzVarB = b(resources, xml, attributeSetAsAttributeSet, i);
                        if (euzVarB instanceof eva) {
                            return (eva) euzVarB;
                        }
                        throw new IllegalArgumentException(a.bq(name, "Root element <", "> did not inflate into a NavGraph"));
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
