package g5;

import Wa.h;
import android.util.Log;
import h5.C2780d;
import java.io.File;
import org.apache.tika.utils.StringUtils;
import uc.C4278o;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2706c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f35733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f35735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f35736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2704a f35737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4278o f35738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f35739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f35740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2708e f35741i;

    public RunnableC2706c(C2708e c2708e, boolean z2, String str, h hVar, Boolean bool, C2704a c2704a, C4278o c4278o, boolean z10, int i5) {
        this.f35741i = c2708e;
        this.f35733a = z2;
        this.f35734b = str;
        this.f35735c = hVar;
        this.f35736d = bool;
        this.f35737e = c2704a;
        this.f35738f = c4278o;
        this.f35739g = z10;
        this.f35740h = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (C2708e.f35749h) {
            if (!this.f35733a) {
                File file = new File(new File(this.f35734b).getParent());
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    this.f35735c.b("sqlite_error", "open_failed " + this.f35734b, null);
                    return;
                }
            }
            try {
                if (Boolean.TRUE.equals(this.f35736d)) {
                    this.f35737e.c(1, new ae.d(6));
                } else {
                    this.f35737e.c(268435456, null);
                }
                synchronized (C2708e.f35748g) {
                    try {
                        if (this.f35739g) {
                            C2708e.f35744c.put(this.f35734b, Integer.valueOf(this.f35740h));
                        }
                        C2708e.f35753m.put(Integer.valueOf(this.f35740h), this.f35737e);
                    } finally {
                    }
                }
                if (this.f35737e.f35725e >= 1) {
                    Log.d("Sqflite", this.f35737e.b() + "opened " + this.f35740h + StringUtils.SPACE + this.f35734b);
                }
                this.f35735c.a(C2708e.k(this.f35740h, false, false));
            } catch (Exception e7) {
                C2780d c2780d = new C2780d(this.f35738f, this.f35735c);
                C2708e c2708e = this.f35741i;
                C2704a c2704a = this.f35737e;
                c2708e.getClass();
                C2708e.j(e7, c2780d, c2704a);
            }
        }
    }
}
