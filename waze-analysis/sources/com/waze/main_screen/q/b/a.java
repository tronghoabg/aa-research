package com.waze.main_screen.q.b;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.Ref;
import com.waze.main_screen.p.a.b.a.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f27383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27384c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27385d;

    public /* synthetic */ a(Ref ref, boolean z, State state, int i2) {
        this.f27385d = i2;
        this.f27384c = ref;
        this.f27382a = z;
        this.f27383b = state;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.main_screen.q.b.i, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f27385d != 0) {
            State state = this.f27383b;
            boolean z = this.f27382a;
            return ab.l((Ref) this.f27384c, z, state, (Context) obj);
        }
        ?? r0 = this.f27384c;
        State state2 = this.f27383b;
        return b.a(this.f27382a, state2, r0, (Context) obj);
    }

    public /* synthetic */ a(boolean z, State state, i iVar, int i2) {
        this.f27385d = i2;
        this.f27382a = z;
        this.f27383b = state;
        this.f27384c = iVar;
    }
}
