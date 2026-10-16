package androidx.camera.camera2.adapter;

import android.media.MediaCodec;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import e.b.c;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SessionConfigAdapter {
    public static final Companion Companion = new Companion(null);
    private final f deferrableSurfaces$delegate;
    private final boolean isPrimary;
    private final f sessionConfig$delegate;
    private final f surfaceToStreamUseCaseMap$delegate;
    private final f surfaceToStreamUseHintMap$delegate;
    private final Collection<UseCase> useCases;
    private final f validatingBuilder$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.SessionConfigAdapter$reportSurfaceInvalid$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ SessionConfig $sessionConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SessionConfig sessionConfig, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$sessionConfig = sessionConfig;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$sessionConfig, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            SessionConfig.ErrorListener errorListener;
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            SessionConfig sessionConfig = this.$sessionConfig;
            if (sessionConfig != null && (errorListener = sessionConfig.getErrorListener()) != null) {
                errorListener.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionConfigAdapter(Collection<? extends UseCase> collection, boolean z) {
        x.f(collection, "useCases");
        this.useCases = collection;
        this.isPrimary = z;
        this.surfaceToStreamUseCaseMap$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SessionConfigAdapter.surfaceToStreamUseCaseMap_delegate$lambda$0(this.f$0);
            }
        });
        this.surfaceToStreamUseHintMap$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return SessionConfigAdapter.surfaceToStreamUseHintMap_delegate$lambda$0(this.f$0);
            }
        });
        this.validatingBuilder$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return SessionConfigAdapter.validatingBuilder_delegate$lambda$0(this.f$0);
            }
        });
        this.sessionConfig$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return SessionConfigAdapter.sessionConfig_delegate$lambda$0(this.f$0);
            }
        });
        this.deferrableSurfaces$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return SessionConfigAdapter.deferrableSurfaces_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final List deferrableSurfaces_delegate$lambda$0(SessionConfigAdapter sessionConfigAdapter) {
        if (!sessionConfigAdapter.getValidatingBuilder().isValid()) {
            throw new IllegalStateException("Check failed.");
        }
        SessionConfig.OutputConfig postviewOutputConfig = sessionConfigAdapter.getSessionConfig().getPostviewOutputConfig();
        if (postviewOutputConfig != null) {
            ArrayList arrayList = new ArrayList();
            List<DeferrableSurface> surfaces = sessionConfigAdapter.getSessionConfig().getSurfaces();
            x.e(surfaces, "getSurfaces(...)");
            arrayList.addAll(surfaces);
            DeferrableSurface surface = postviewOutputConfig.getSurface();
            x.e(surface, "getSurface(...)");
            arrayList.add(surface);
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            if (listUnmodifiableList != null) {
                return listUnmodifiableList;
            }
        }
        return sessionConfigAdapter.getSessionConfig().getSurfaces();
    }

    private final SessionConfig getSessionConfig() {
        Object value = this.sessionConfig$delegate.getValue();
        x.e(value, "getValue(...)");
        return (SessionConfig) value;
    }

    private final long getStreamUseHintForContainerClass(Class<?> cls) {
        return x.n(cls, MediaCodec.class) ? OutputStream.StreamUseHint.Companion.m836getVIDEO_RECORD4VYZOf8() : OutputStream.StreamUseHint.Companion.m835getDEFAULT4VYZOf8();
    }

    private final SessionConfig.ValidatingBuilder getValidatingBuilder() {
        return (SessionConfig.ValidatingBuilder) this.validatingBuilder$delegate.getValue();
    }

    static final SessionConfig sessionConfig_delegate$lambda$0(SessionConfigAdapter sessionConfigAdapter) {
        if (sessionConfigAdapter.getValidatingBuilder().isValid()) {
            return sessionConfigAdapter.getValidatingBuilder().build();
        }
        throw new IllegalStateException("Check failed.");
    }

    static final Map surfaceToStreamUseCaseMap_delegate$lambda$0(SessionConfigAdapter sessionConfigAdapter) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UseCase useCase : sessionConfigAdapter.useCases) {
            arrayList.add(Companion.getSessionConfig(useCase, sessionConfigAdapter.isPrimary));
            UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
            x.e(currentConfig, "getCurrentConfig(...)");
            arrayList2.add(currentConfig);
        }
        return sessionConfigAdapter.getSurfaceToStreamUseCaseMapping(arrayList, arrayList2);
    }

    static final Map surfaceToStreamUseHintMap_delegate$lambda$0(SessionConfigAdapter sessionConfigAdapter) {
        Collection<UseCase> collection = sessionConfigAdapter.useCases;
        ArrayList arrayList = new ArrayList(i.q(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Companion.getSessionConfig((UseCase) it.next(), sessionConfigAdapter.isPrimary));
        }
        return sessionConfigAdapter.getSurfaceToStreamUseHintMapping(arrayList);
    }

    static final SessionConfig.ValidatingBuilder validatingBuilder_delegate$lambda$0(SessionConfigAdapter sessionConfigAdapter) {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator<UseCase> it = sessionConfigAdapter.useCases.iterator();
        while (it.hasNext()) {
            validatingBuilder.add(Companion.getSessionConfig(it.next(), sessionConfigAdapter.isPrimary));
        }
        return validatingBuilder;
    }

    public final List<DeferrableSurface> getDeferrableSurfaces() {
        Object value = this.deferrableSurfaces$delegate.getValue();
        x.e(value, "getValue(...)");
        return (List) value;
    }

    public final Map<DeferrableSurface, Long> getSurfaceToStreamUseCaseMap() {
        return (Map) this.surfaceToStreamUseCaseMap$delegate.getValue();
    }

    public final Map<DeferrableSurface, Long> getSurfaceToStreamUseCaseMapping(Collection<SessionConfig> collection, Collection<? extends UseCaseConfig<?>> collection2) {
        x.f(collection, "sessionConfigs");
        x.f(collection2, "useCaseConfigs");
        Collection<SessionConfig> collection3 = collection;
        if (!collection3.isEmpty()) {
            Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                if (((SessionConfig) it.next()).getTemplateType() == 5) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isErrorEnabled(Log.TAG)) {
                        android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "ZSL in populateSurfaceToStreamUseCaseMapping()");
                    }
                    return r.j();
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StreamUseCaseUtil.INSTANCE.populateSurfaceToStreamUseCaseMapping(collection, collection2, linkedHashMap);
        return linkedHashMap;
    }

    public final Map<DeferrableSurface, Long> getSurfaceToStreamUseHintMap() {
        return (Map) this.surfaceToStreamUseHintMap$delegate.getValue();
    }

    public final Map<DeferrableSurface, Long> getSurfaceToStreamUseHintMapping(Collection<SessionConfig> collection) {
        x.f(collection, "sessionConfigs");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SessionConfig sessionConfig : collection) {
            for (DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
                if (!sessionConfig.getImplementationOptions().containsOption(Camera2ImplConfig.STREAM_USE_HINT_OPTION) || sessionConfig.getImplementationOptions().retrieveOption(Camera2ImplConfig.STREAM_USE_HINT_OPTION) == null) {
                    linkedHashMap.put(deferrableSurface, Long.valueOf(getStreamUseHintForContainerClass(deferrableSurface.getContainerClass())));
                } else {
                    Object objRetrieveOption = sessionConfig.getImplementationOptions().retrieveOption(Camera2ImplConfig.STREAM_USE_HINT_OPTION);
                    x.c(objRetrieveOption);
                    linkedHashMap.put(deferrableSurface, objRetrieveOption);
                }
            }
        }
        return linkedHashMap;
    }

    public final SessionConfig getValidSessionConfigOrNull() {
        if (isSessionConfigValid()) {
            return getSessionConfig();
        }
        return null;
    }

    public final boolean isSessionConfigValid() {
        return getValidatingBuilder().isValid();
    }

    public final void reportSurfaceInvalid(DeferrableSurface deferrableSurface) {
        Object next;
        x.f(deferrableSurface, "deferrableSurface");
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Unavailable " + deferrableSurface + ", notify SessionConfig invalid");
        }
        Iterator<T> it = this.useCases.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Companion.getSessionConfig((UseCase) next, this.isPrimary).getSurfaces().contains(deferrableSurface)) {
                break;
            }
        }
        UseCase useCase = (UseCase) next;
        SessionConfig sessionConfig = useCase != null ? useCase.getSessionConfig() : null;
        int i2 = av.f51370a;
        aj.z(aj.e(ac.f51860a.c()), null, null, new AnonymousClass2(sessionConfig, null), 3);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SessionConfig getSessionConfig(UseCase useCase, boolean z) {
            SessionConfig secondarySessionConfig;
            String str;
            x.f(useCase, "<this>");
            if (z) {
                secondarySessionConfig = useCase.getSessionConfig();
                str = "getSessionConfig(...)";
            } else {
                secondarySessionConfig = useCase.getSecondarySessionConfig();
                str = "getSecondarySessionConfig(...)";
            }
            x.e(secondarySessionConfig, str);
            return secondarySessionConfig;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SessionConfigAdapter(Collection collection, boolean z, int i2, o oVar) {
        this(collection, z | (!((i2 & 2) == 0)));
    }
}
