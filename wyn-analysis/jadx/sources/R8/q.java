package R8;

import A7.C0237b0;
import android.content.Context;
import android.util.Log;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10508d;

    public /* synthetic */ q(s sVar, String str, String str2, int i5) {
        this.f10505a = i5;
        this.f10506b = sVar;
        this.f10507c = str;
        this.f10508d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10505a) {
            case 0:
                String str = this.f10507c;
                String str2 = this.f10508d;
                m mVar = this.f10506b.f10517h;
                mVar.getClass();
                try {
                    ((C0237b0) mVar.f10480d.f16187d).s(str, str2);
                    return;
                } catch (IllegalArgumentException e7) {
                    Context context = mVar.f10477a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e7;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            default:
                this.f10506b.f10517h.i(this.f10507c, this.f10508d);
                return;
        }
    }
}
