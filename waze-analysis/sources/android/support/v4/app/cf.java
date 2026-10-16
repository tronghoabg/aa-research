package android.support.v4.app;

import androidx.autofill.HintConstants;
import androidx.tracing.EmptyCloseable;
import androidx.tracing.EventMetadata;
import androidx.tracing.EventMetadataCloseable;
import androidx.tracing.Tracer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private final ar f245a;

    public cf(ar arVar) {
        h.g.b.x.f(arVar, "fragment");
        this.f245a = arVar;
    }

    public final void a(String str, Runnable runnable) {
        EmptyCloseable emptyCloseable;
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(runnable, "block");
        Tracer global = Tracer.Companion.getGlobal();
        if (global.isCategoryEnabled("androidx.fragment")) {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = global.beginSectionWithMetadata("androidx.fragment", str, null, false);
            EventMetadata eventMetadata = eventMetadataCloseableBeginSectionWithMetadata.metadata;
            String string = this.f245a.toString();
            h.g.b.x.e(string, "toString(...)");
            eventMetadata.addMetadataEntry("fragment", string);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        } else {
            emptyCloseable = EmptyCloseable.INSTANCE;
        }
        try {
            runnable.run();
        } finally {
        }
    }
}
