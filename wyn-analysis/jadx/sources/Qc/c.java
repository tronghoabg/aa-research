package Qc;

import Pc.C0786b;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.l;

/* loaded from: classes5.dex */
public class c implements InterfaceC3885b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9945c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public Context f9946a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9947b = false;

    public static f a(l lVar) {
        String str = lVar.f45343a;
        String str2 = lVar.f45347e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = lVar.f45349g;
        if (str3 == null) {
            str3 = null;
        }
        f fVar = new f();
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        fVar.f9951a = str;
        String str4 = lVar.f45344b;
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        fVar.f9952b = str4;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        fVar.f9953c = str2;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        fVar.f9954d = str3;
        fVar.f9955e = null;
        fVar.f9956f = lVar.f45345c;
        fVar.f9957g = lVar.f45348f;
        fVar.f9958h = null;
        fVar.f9959i = lVar.f45346d;
        fVar.f9960j = null;
        fVar.k = null;
        fVar.f9961l = null;
        fVar.f9962m = null;
        fVar.f9963n = null;
        return fVar;
    }

    public static void b(TaskCompletionSource taskCompletionSource, h hVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new C0786b(hVar, 25));
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        N0.a.B(c3884a.f44188c, this);
        N0.a.A(c3884a.f44188c, this);
        this.f9946a = c3884a.f44186a;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f9946a = null;
        N0.a.B(c3884a.f44188c, null);
        N0.a.A(c3884a.f44188c, null);
    }
}
