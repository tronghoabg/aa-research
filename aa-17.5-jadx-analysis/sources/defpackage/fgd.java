package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class fgd {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final yw c = new yw();

    public static final fgc a(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null, context);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x020e, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020e A[EDGE_INSN: B:122:0x020e->B:118:0x020e BREAK  A[LOOP:0: B:7:0x0017->B:133:0x0017], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d2 A[EDGE_INSN: B:138:0x01d2->B:103:0x01d2 BREAK  A[LOOP:1: B:52:0x00e5->B:140:0x00e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.fgc b(org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, defpackage.fgc r18, android.content.Context r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgd.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, fgc, android.content.Context):fgc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object c(AttributeSet attributeSet, Class cls, String str, Context context) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            yw ywVar = c;
            synchronized (ywVar) {
                Constructor constructor = (Constructor) ywVar.get(attributeValue);
                if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, context.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = clsAsSubclass.getConstructor(b);
                    constructor.setAccessible(true);
                    ywVar.put(attributeValue, constructor);
                }
                objNewInstance = constructor.newInstance(context, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }
}
