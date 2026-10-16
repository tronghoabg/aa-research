package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.ZslControlNoOpImpl;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.TemplateParamsQuirkOverride;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConfigQueryResult;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.SessionConfig;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.k;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FeatureCombinationQueryImpl implements FeatureCombinationQuery {
    private final CameraMetadata cameraMetadata;
    private final CameraPipe cameraPipe;
    private final CameraQuirks cameraQuirks;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super Boolean>, Object> {
        final /* synthetic */ GraphConfigBundle $graphConfigBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GraphConfigBundle graphConfigBundle, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$graphConfigBundle = graphConfigBundle;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FeatureCombinationQueryImpl.this.new AnonymousClass1(this.$graphConfigBundle, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Boolean> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                FeatureCombinationQueryImpl featureCombinationQueryImpl = FeatureCombinationQueryImpl.this;
                GraphConfigBundle graphConfigBundle = this.$graphConfigBundle;
                this.label = 1;
                obj = featureCombinationQueryImpl.cameraPipe.mo571isConfigSupportedNpXggIU(graphConfigBundle.getGraphConfig(), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            GraphConfigBundle graphConfigBundle2 = this.$graphConfigBundle;
            ConfigQueryResult configQueryResult = (ConfigQueryResult) obj;
            int iM602unboximpl = configQueryResult.m602unboximpl();
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str = Camera2Logger.TRUNCATED_TAG;
                List<CameraStream.Config> streams = graphConfigBundle2.getGraphConfig().getStreams();
                ArrayList arrayList = new ArrayList(i.q(streams, 10));
                Iterator<T> it = streams.iterator();
                while (it.hasNext()) {
                    List<OutputStream.Config> outputs = ((CameraStream.Config) it.next()).getOutputs();
                    ArrayList arrayList2 = new ArrayList(i.q(outputs, 10));
                    for (OutputStream.Config config : outputs) {
                        arrayList2.add("size=" + config.getSize() + ", format=" + StreamFormat.m928toStringimpl(config.m765getFormat8FPWQzE()) + ", dynamicRangeProfile" + config.m764getDynamicRangeProfileOoVcG5w());
                    }
                    arrayList.add(arrayList2);
                }
                android.util.Log.d(str, "FeatureCombinationQueryImpl#isSupported: result = " + ConfigQueryResult.m601toStringimpl(iM602unboximpl) + " for sessionParameters = " + graphConfigBundle2.getGraphConfig().getSessionParameters() + " and streams = " + arrayList);
            }
            return Boolean.valueOf(ConfigQueryResult.m599equalsimpl0(configQueryResult.m602unboximpl(), ConfigQueryResult.Companion.m603getSUPPORTEDXp6DSB4()));
        }
    }

    public FeatureCombinationQueryImpl(CameraMetadata cameraMetadata, CameraPipe cameraPipe, CameraQuirks cameraQuirks) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(cameraPipe, "cameraPipe");
        x.f(cameraQuirks, "cameraQuirks");
        this.cameraMetadata = cameraMetadata;
        this.cameraPipe = cameraPipe;
        this.cameraQuirks = cameraQuirks;
    }

    @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
    public boolean isSupported(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        return ((Boolean) aj.t(k.f48060a, new AnonymousClass1(CameraGraphConfigProvider.m236create79VDu0o$default(new CameraGraphConfigProvider(new CameraCallbackMap(), new ComboRequestListener(), new CameraConfig(this.cameraMetadata.mo565getCameraDz_R5H8(), null), this.cameraQuirks, new ZslControlNoOpImpl(), new TemplateParamsQuirkOverride(this.cameraQuirks.getQuirks()), this.cameraMetadata, null, null, 384, null), CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no(), sessionConfig, true, null, null, null, null, 120, null), null))).booleanValue();
    }
}
