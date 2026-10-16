package androidx.camera.viewfinder.core.impl;

import androidx.camera.viewfinder.core.ImplementationMode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImplementationModeCompat {
    public static final Companion Companion = new Companion(null);

    public static final ImplementationMode chooseCompatibleMode() {
        return Companion.chooseCompatibleMode();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.viewfinder.core.ImplementationMode chooseCompatibleMode() {
            /*
                r1 = this;
                androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks r1 = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.INSTANCE
                androidx.camera.viewfinder.core.impl.quirk.Quirks r1 = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.access$getQUIRKS$p()
                java.util.List r1 = androidx.camera.viewfinder.core.impl.quirk.Quirks.access$getQuirks$p(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L1a
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                goto L2f
            L1a:
                java.util.Iterator r1 = r1.iterator()
            L1e:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L2f
                java.lang.Object r0 = r1.next()
                androidx.camera.viewfinder.core.impl.quirk.Quirk r0 = (androidx.camera.viewfinder.core.impl.quirk.Quirk) r0
                boolean r0 = r0 instanceof androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk
                if (r0 == 0) goto L1e
                goto L5b
            L2f:
                androidx.camera.viewfinder.core.impl.quirk.Quirks r1 = androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks.access$getQUIRKS$p()
                java.util.List r1 = androidx.camera.viewfinder.core.impl.quirk.Quirks.access$getQuirks$p(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L47
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L47
                goto L5e
            L47:
                java.util.Iterator r1 = r1.iterator()
            L4b:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L5e
                java.lang.Object r0 = r1.next()
                androidx.camera.viewfinder.core.impl.quirk.Quirk r0 = (androidx.camera.viewfinder.core.impl.quirk.Quirk) r0
                boolean r0 = r0 instanceof androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk
                if (r0 == 0) goto L4b
            L5b:
                androidx.camera.viewfinder.core.ImplementationMode r1 = androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED
                return r1
            L5e:
                androidx.camera.viewfinder.core.ImplementationMode r1 = androidx.camera.viewfinder.core.ImplementationMode.EXTERNAL
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.viewfinder.core.impl.ImplementationModeCompat.Companion.chooseCompatibleMode():androidx.camera.viewfinder.core.ImplementationMode");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
