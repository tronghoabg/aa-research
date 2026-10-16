package defpackage;

import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import org.xml.sax.Attributes;

/* loaded from: classes3.dex */
final class acki {
    public Paint a;
    public Paint b;
    public final float c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public acki(ackj ackjVar, Attributes attributes) {
        this.a = null;
        this.b = null;
        this.g = 0;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.c = ackjVar.a("x", attributes, fValueOf).floatValue();
        this.d = ackjVar.a("y", attributes, fValueOf).floatValue();
        this.e = null;
        this.f = true;
        ackh ackhVar = new ackh(attributes);
        if (ackjVar.b(ackhVar, ackjVar.r)) {
            Paint paint = new Paint(ackjVar.h);
            this.b = paint;
            ackjVar.d(attributes, paint);
        }
        if (ackjVar.c(ackhVar)) {
            Paint paint2 = new Paint(ackjVar.d);
            this.a = paint2;
            ackjVar.d(attributes, paint2);
        }
        String strH = aclf.h("alignment-baseline", attributes);
        if ("middle".equals(strH)) {
            this.g = 1;
        } else if ("top".equals(strH)) {
            this.g = 2;
        }
    }
}
