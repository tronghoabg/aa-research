package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.io.IOException;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class M extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f31239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31245h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31246i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31247j;
    public final /* synthetic */ kotlin.jvm.internal.G k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f31250n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(XmlPullParser xmlPullParser, InterfaceC3103c interfaceC3103c, kotlin.jvm.internal.G g9, kotlin.jvm.internal.G g10, kotlin.jvm.internal.G g11, kotlin.jvm.internal.G g12, kotlin.jvm.internal.G g13, kotlin.jvm.internal.G g14, kotlin.jvm.internal.G g15, kotlin.jvm.internal.G g16, kotlin.jvm.internal.G g17, kotlin.jvm.internal.G g18, kotlin.jvm.internal.G g19, kotlin.jvm.internal.G g20) {
        super(2, interfaceC3103c);
        this.f31239b = xmlPullParser;
        this.f31240c = g9;
        this.f31241d = g10;
        this.f31242e = g11;
        this.f31243f = g12;
        this.f31244g = g13;
        this.f31245h = g14;
        this.f31246i = g15;
        this.f31247j = g16;
        this.k = g17;
        this.f31248l = g18;
        this.f31249m = g19;
        this.f31250n = g20;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        M m10 = new M(this.f31239b, interfaceC3103c, this.f31240c, this.f31241d, this.f31242e, this.f31243f, this.f31244g, this.f31245h, this.f31246i, this.f31247j, this.k, this.f31248l, this.f31249m, this.f31250n);
        m10.f31238a = obj;
        return m10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        M m10 = (M) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        m10.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        String text;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ef.H.o((Ef.E) this.f31238a);
        XmlPullParser xmlPullParser = this.f31239b;
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
                    this.f31240c.f39740a = J0.f(xmlPullParser, "id");
                    this.f31241d.f39740a = Boolean.valueOf(AbstractC3340k.a(J0.f(xmlPullParser, "delivery"), "progressive"));
                    this.f31242e.f39740a = J0.f(xmlPullParser, "type");
                    String strF = J0.f(xmlPullParser, "width");
                    this.f31243f.f39740a = strF != null ? Bf.r.l0(strF) : null;
                    String strF2 = J0.f(xmlPullParser, "height");
                    this.f31244g.f39740a = strF2 != null ? Bf.r.l0(strF2) : null;
                    this.f31245h.f39740a = J0.f(xmlPullParser, "codec");
                    String strF3 = J0.f(xmlPullParser, "bitrate");
                    this.f31246i.f39740a = strF3 != null ? Bf.r.l0(strF3) : null;
                    String strF4 = J0.f(xmlPullParser, "minBitrate");
                    this.f31247j.f39740a = strF4 != null ? Bf.r.l0(strF4) : null;
                    String strF5 = J0.f(xmlPullParser, "maxBitrate");
                    this.k.f39740a = strF5 != null ? Bf.r.l0(strF5) : null;
                    String strF6 = J0.f(xmlPullParser, "scalable");
                    this.f31248l.f39740a = strF6 != null ? Boolean.valueOf(Boolean.parseBoolean(strF6)) : null;
                    this.f31249m.f39740a = J0.f(xmlPullParser, "apiFramework");
                } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !Bf.k.y0(text)) {
                    String text2 = xmlPullParser.getText();
                    AbstractC3340k.d(text2, "getText(...)");
                    this.f31250n.f39740a = Bf.k.V0(text2).toString();
                } else if (xmlPullParser.getEventType() == 3) {
                    return c2515c;
                }
                xmlPullParser.next();
            }
        }
        return c2515c;
    }
}
