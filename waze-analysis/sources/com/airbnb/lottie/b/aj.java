package com.airbnb.lottie.b;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h f1974a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1975b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(com.airbnb.lottie.h hVar, Context context, String str, h.c.e eVar) {
        super(2, eVar);
        this.f1974a = hVar;
        this.f1975b = context;
        this.f1976c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aj(this.f1974a, this.f1975b, this.f1976c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        for (com.airbnb.lottie.t tVar : this.f1974a.o().values()) {
            h.g.b.x.c(tVar);
            int i2 = an.f1992a;
            if (tVar.c() == null) {
                String strE = tVar.e();
                if (h.n.o.ah(strE, "data:")) {
                    String str = strE;
                    if (h.n.o.X(str, "base64,", 0, false, 6) > 0) {
                        try {
                            String strSubstring = strE.substring(h.n.o.W(str, ',', 0, 6) + 1);
                            h.g.b.x.e(strSubstring, "substring(...)");
                            byte[] bArrDecode = Base64.decode(strSubstring, 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            tVar.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException e2) {
                            com.airbnb.lottie.g.c.b("data URL did not have correct base64 format.", e2);
                        }
                    }
                }
            }
            Context context = this.f1975b;
            String str2 = this.f1976c;
            if (tVar.c() == null && str2 != null) {
                String strE2 = tVar.e();
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + strE2);
                    h.g.b.x.c(inputStreamOpen);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        tVar.g(com.airbnb.lottie.g.k.d(BitmapFactory.decodeStream(inputStreamOpen, null, options2), tVar.b(), tVar.a()));
                    } catch (IllegalArgumentException e3) {
                        com.airbnb.lottie.g.c.b("Unable to decode image.", e3);
                    }
                } catch (IOException e4) {
                    com.airbnb.lottie.g.c.b("Unable to open asset.", e4);
                }
            }
        }
        return h.ab.f48028a;
    }
}
