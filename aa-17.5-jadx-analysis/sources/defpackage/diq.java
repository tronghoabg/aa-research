package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class diq extends dsg {
    final /* synthetic */ aitf a;
    final /* synthetic */ dhe b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diq(aitf aitfVar, dhe dheVar, Context context) {
        super(null);
        this.a = aitfVar;
        this.b = dheVar;
        this.c = context;
    }

    @Override // defpackage.dsg
    public final void a(int i) {
        String str = i != -3 ? i != -2 ? i != -1 ? i != 1 ? i != 2 ? i != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable";
        dhe dheVar = this.b;
        this.a.g(new IllegalStateException("Failed to load " + dheVar + " (reason=" + i + ", " + str + ")"));
    }

    @Override // defpackage.dsg
    public final void b(Typeface typeface) {
        ThreadLocal threadLocal = dis.a;
        if (typeface == null) {
            typeface = null;
        } else {
            dic dicVar = this.b.b;
            if (!dicVar.a.isEmpty()) {
                ThreadLocal threadLocal2 = dis.a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                Context context = this.c;
                paint.setFontVariationSettings(null);
                paint.setTypeface(typeface);
                paint.setFontVariationSettings(dap.u(dicVar, context));
                typeface = paint.getTypeface();
            }
        }
        this.a.w(typeface);
    }
}
