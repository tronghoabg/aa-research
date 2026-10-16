package Rd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f10592e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final D8.a f10593a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4345a f10594b;

    /* renamed from: c, reason: collision with root package name */
    public List f10595c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10596d;

    public c(D8.a phase, AbstractC4345a abstractC4345a) {
        AbstractC3340k.e(phase, "phase");
        ArrayList arrayList = f10592e;
        AbstractC3340k.c(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        List interceptors = K.b(arrayList);
        AbstractC3340k.e(interceptors, "interceptors");
        this.f10593a = phase;
        this.f10594b = abstractC4345a;
        this.f10595c = interceptors;
        this.f10596d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final String toString() {
        return "Phase `" + this.f10593a.f2562b + "`, " + this.f10595c.size() + " handlers";
    }
}
