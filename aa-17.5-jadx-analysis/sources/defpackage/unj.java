package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.projection.gearhead.GhApplication;
import java.io.File;
import java.util.Map;
import org.chromium.net.CronetException;

/* loaded from: classes.dex */
public final /* synthetic */ class unj implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ unj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, vae] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, uzy] */
    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor editorEdit = null;
        switch (this.c) {
            case 0:
                ((unk) this.a).c.a((String) this.b);
                return;
            case 1:
                vaq.d();
                Object obj = this.b;
                Object obj2 = this.a;
                byte[] bArr = ((upy) obj).c;
                if (bArr != null) {
                    ((unk) obj2).b.a(bArr);
                    return;
                }
                return;
            case 2:
                uoz uozVar = (uoz) this.a;
                long jA = uozVar.a();
                upa upaVar = (upa) this.b;
                ((ynz) ((ynz) upa.a.f()).ai(9526)).x("Database cache size: %d bytes", jA);
                upaVar.h(uozVar);
                for (File file : upaVar.k()) {
                    if (!file.equals(upaVar.f()) && file.exists()) {
                        String[] strArr = upa.b;
                        for (int i = 0; i < 3; i++) {
                            uym.c(new File(file, strArr[i]));
                        }
                    }
                }
                return;
            case 3:
                ((upa) this.b).h((uoz) this.a);
                return;
            case 4:
                upm upmVar = ((upi) this.a).a;
                if (upmVar.m != null) {
                    upmVar.m.a((achw) this.b);
                    return;
                }
                return;
            case 5:
                uqt uqtVar = (uqt) this.b;
                uqtVar.e((uqp) this.a, uqtVar.f);
                return;
            case 6:
                ((uxz) this.a).b.removeCallbacks(this.b);
                return;
            case 7:
                ykd ykdVar = ((uzb) this.b).a;
                Object obj3 = this.a;
                Object obj4 = ykdVar.a;
                synchronized (obj4) {
                    ((upy) obj4).i((Bitmap) obj3);
                    ((upy) obj4).f();
                }
                return;
            case 8:
                Object obj5 = this.b;
                if (((vag) obj5).a) {
                    return;
                }
                ?? r9 = this.a;
                vad vadVar = (vad) r9;
                vadVar.p(true);
                try {
                    ((vag) obj5).c.a(r9);
                    return;
                } finally {
                    vadVar.p(false);
                }
            case 9:
                ((vkh) this.a).a.p(lws.G((CronetException) this.b));
                return;
            case 10:
                ((vkm) this.a).a.p(lws.G((CronetException) this.b));
                return;
            case 11:
                xxh xxhVar = (xxh) this.b;
                boolean zF = xxhVar.f();
                Object obj6 = this.a;
                if (!zF || ((Boolean) ((aezk) xxhVar.b()).a()).booleanValue()) {
                    synchronized (obj6) {
                        ((vud) obj6).a = true;
                        Activity activity = ((vud) obj6).b;
                        if (activity != null) {
                            ((vud) obj6).c(activity);
                        }
                        ((vud) obj6).b = null;
                    }
                    return;
                }
                return;
            case 12:
                ((vvc) this.b).c.g.a(5, ((vky) this.a).a);
                return;
            case 13:
                SharedPreferences sharedPreferences = ((Context) this.a).getSharedPreferences("PhenotypeStickyAccount", 0);
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferences.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case 14:
                try {
                    wub.af(this.b);
                    return;
                } catch (Exception e) {
                    Log.w("FlagStore", "Failed to store account on flag read for: " + ((wcq) this.a).e + " which may lead to stale flags.", e);
                    return;
                }
            case 15:
                ((wcq) this.a).c(this.b);
                return;
            case 16:
                wht whtVar = (wht) this.a;
                whtVar.e.b(whtVar.a((abxk) this.b));
                return;
            case 17:
                wht whtVar2 = (wht) this.b;
                whtVar2.e.a(whtVar2.b, (whf) this.a);
                return;
            case 18:
                ((SurveyViewPager) this.a).s().f((String) this.b);
                return;
            case 19:
                ((fig) this.a).b(((ViewPager) this.b).c);
                return;
            default:
                if (acpi.d()) {
                    kwm.a((Context) this.a, ((GhApplication) this.b).a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ unj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public unj(vkm vkmVar, CronetException cronetException, int i) {
        this.c = i;
        this.b = cronetException;
        this.a = vkmVar;
    }
}
