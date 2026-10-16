package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.io.IOException;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066e0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2066e0(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10) {
        super(2, interfaceC3103c);
        this.f31358b = xmlPullParser;
        this.f31359c = g9;
        this.f31360d = g10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2066e0 c2066e0 = new C2066e0(this.f31358b, interfaceC3103c, this.f31359c, this.f31360d);
        c2066e0.f31357a = obj;
        return c2066e0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        C2066e0 c2066e0 = (C2066e0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2066e0.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        String text;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ef.H.o((Ef.E) this.f31357a);
        XmlPullParser xmlPullParser = this.f31358b;
        if (J0.i(xmlPullParser)) {
            xmlPullParser.nextTag();
        }
        boolean z2 = xmlPullParser.getEventType() == 1;
        C2515C c2515c = C2515C.f34653a;
        if (!z2) {
            if (xmlPullParser.getEventType() != 2) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = xmlPullParser.getDepth();
            while (xmlPullParser.getDepth() >= depth) {
                int depth2 = xmlPullParser.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        J0.l(xmlPullParser);
                    }
                } else if (xmlPullParser.getEventType() == 2) {
                    this.f31359c.f39740a = J0.f(xmlPullParser, "id");
                } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !Bf.k.y0(text)) {
                    String text2 = xmlPullParser.getText();
                    AbstractC3340k.d(text2, "getText(...)");
                    this.f31360d.f39740a = Bf.k.V0(text2).toString();
                } else if (xmlPullParser.getEventType() == 3) {
                    return c2515c;
                }
                xmlPullParser.next();
            }
        }
        return c2515c;
    }
}
