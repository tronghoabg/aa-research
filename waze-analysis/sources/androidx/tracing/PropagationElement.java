package androidx.tracing;

import h.ab;
import h.c.j;
import java.util.List;
import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PropagationElement extends PlatformThreadContextElement implements dc<ab> {
    private String category;
    private final List<Long> flowIds;
    private String name;
    private final PerfettoTracer tracer;

    public PropagationElement(PerfettoTracer perfettoTracer, String str, String str2, List<Long> list) {
        super(perfettoTracer, str, str2, list);
        this.tracer = perfettoTracer;
        this.category = str;
        this.name = str2;
        this.flowIds = list;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public String getCategory() {
        return this.category;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public List<Long> getFlowIds() {
        return this.flowIds;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public String getName() {
        return this.name;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public PerfettoTracer getTracer$tracing() {
        return this.tracer;
    }

    @Override // kotlinx.coroutines.dc
    public /* bridge */ /* synthetic */ void restoreThreadContext(j jVar, ab abVar) {
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public void setCategory(String str) {
        this.category = str;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public void setName(String str) {
        this.name = str;
    }

    @Override // kotlinx.coroutines.dc
    public /* bridge */ /* synthetic */ ab updateThreadContext(j jVar) {
        return ab.f48028a;
    }

    /* renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(j jVar, ab abVar) {
    }

    /* renamed from: updateThreadContext, reason: avoid collision after fix types in other method */
    public void updateThreadContext2(j jVar) {
    }
}
