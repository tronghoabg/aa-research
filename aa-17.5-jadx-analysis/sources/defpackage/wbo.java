package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
abstract class wbo implements wcj {
    public final String a;
    public final String b;
    public final wcr c;

    public wbo(String str, String str2, wcr wcrVar) {
        this.a = str;
        this.b = str2;
        this.c = wcrVar;
    }

    protected abstract Object b(Object obj) throws IOException;

    protected abstract Object c(String str) throws IOException;

    protected Object e() {
        return null;
    }

    protected abstract Object f(wae waeVar);

    @Override // defpackage.wcj, defpackage.xyc
    public final Object gu() {
        wae waeVarA;
        boolean z;
        AtomicReference atomicReference = wae.a;
        wag.e = true;
        if (wag.f == null) {
            wag.f = new waf();
        }
        Context context = (Context) wae.a.get();
        if (context == null) {
            synchronized (wag.a) {
                z = wag.b;
            }
            if (!z) {
                throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
            }
            waeVarA = null;
        } else {
            waeVarA = wae.a(context);
        }
        Object objF = f(waeVarA);
        objF.getClass();
        return objF;
    }

    @Override // defpackage.wcj
    public final Object gv(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objF = f(wae.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final Object gw(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }
}
