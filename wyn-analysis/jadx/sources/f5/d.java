package F5;

import J9.C0645d;
import Se.u;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Locale;
import ta.C4154c;
import ta.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements u6.g, G2.g, SuccessContinuation, Le.b, Le.a, Le.c, Le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3886a;

    public /* synthetic */ d(int i5) {
        this.f3886a = i5;
    }

    @Override // G2.g
    public boolean a(int i5, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        switch (this.f3886a) {
            case 12:
                Log.e("FIAM.Headless", "Impression store write failure");
                break;
            case 14:
                Log.e("FIAM.Headless", "Rate limiter client write failure");
                break;
            case 19:
                ic.d.E("Event Triggered: " + ((String) obj));
                break;
            case 21:
                ic.d.F("App foreground rate limited ? : " + ((Boolean) obj));
                break;
            case 24:
                Locale locale = Locale.US;
                ic.d.F("Successfully fetched " + ((o) obj).e().size() + " messages from backend");
                break;
            case 25:
                ic.d.G("Service fetch error: " + ((Throwable) obj).getMessage());
                break;
            case 27:
                ic.d.G("Cache write error: " + ((Throwable) obj).getMessage());
                break;
            default:
                ic.d.G("Impression store read fail: " + ((Throwable) obj).getMessage());
                break;
        }
    }

    @Override // Le.c
    public Object apply(Object obj) {
        switch (this.f3886a) {
            case 16:
                return ((ta.f) obj).c();
            case 17:
                List list = (List) obj;
                Ne.b.a(list, "source is null");
                return new u(list);
            case 18:
                return ((C4154c) obj).d();
            default:
                return Qe.c.f9992a;
        }
    }

    public Constructor b() {
        switch (this.f3886a) {
            case 10:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(J5.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(J5.k.class).getConstructor(new Class[0]);
        }
    }

    @Override // u6.g
    public void invoke(Object obj) {
        j jVar = (j) obj;
        switch (this.f3886a) {
            case 0:
                jVar.getClass();
                break;
            case 1:
                jVar.getClass();
                break;
            case 2:
                jVar.getClass();
                break;
            case 3:
                jVar.getClass();
                break;
            case 4:
                jVar.getClass();
                break;
            case 5:
                jVar.getClass();
                break;
            default:
                jVar.getClass();
                break;
        }
    }

    @Override // Le.a
    public void run() {
        switch (this.f3886a) {
            case 13:
                ic.d.E("Impression store write success");
                break;
            case 14:
            default:
                ic.d.E("Wrote to cache");
                break;
            case 15:
                ic.d.E("Rate limiter client write success");
                break;
        }
    }

    @Override // Le.d
    public boolean test(Object obj) {
        switch (this.f3886a) {
            case 22:
                return !((Boolean) obj).booleanValue();
            default:
                C0645d c0645d = (C0645d) obj;
                return (TextUtils.isEmpty(c0645d.f5922a) || TextUtils.isEmpty(c0645d.f5923b.f9265a)) ? false : true;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C8.a aVar = (C8.a) obj;
        switch (this.f3886a) {
        }
        return Tasks.forResult(C8.b.a(aVar));
    }
}
