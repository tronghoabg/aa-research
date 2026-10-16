package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import h.ab;
import h.c.j;
import h.g.a.a;
import h.g.a.p;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        public final void setDiagnosticStackTraceEnabled(boolean z) {
            ComposerKt.m7289setComposeStackTraceMode76WK1J0(z ? ComposeStackTraceMode.Companion.m7647getSourceInformationMD5MrJc() : ComposeStackTraceMode.Companion.m7646getNoneMD5MrJc());
        }

        /* renamed from: setDiagnosticStackTraceMode-76WK1J0, reason: not valid java name */
        public final void m7288setDiagnosticStackTraceMode76WK1J0(int i2) {
            ComposerKt.m7289setComposeStackTraceMode76WK1J0(i2);
        }

        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v, p<? super T, ? super V, ab> pVar);

    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte b2);

    @ComposeCompilerApi
    boolean changed(char c2);

    @ComposeCompilerApi
    boolean changed(double d2);

    @ComposeCompilerApi
    boolean changed(float f2);

    @ComposeCompilerApi
    boolean changed(int i2);

    @ComposeCompilerApi
    boolean changed(long j2);

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    boolean changed(short s);

    @ComposeCompilerApi
    boolean changed(boolean z);

    @ComposeCompilerApi
    boolean changedInstance(Object obj);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i2);

    Applier<?> getApplier();

    j getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    void insertMovableContentReferences(List<k<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    void recordSideEffect(a<ab> aVar);

    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    CancellationHandle scheduleFrameEndCallback(a<ab> aVar);

    boolean shouldExecute(boolean z, int i2);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i2, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startNode();

    void startProvider(ProvidedValue<?> providedValue);

    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i2);

    @ComposeCompilerApi
    void startReplaceableGroup(int i2);

    @ComposeCompilerApi
    Composer startRestartGroup(int i2);

    @ComposeCompilerApi
    void startReusableGroup(int i2, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Composer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @ComposeCompilerApi
        public static /* synthetic */ void getApplier$annotations() {
        }

        public static /* synthetic */ void getApplyCoroutineContext$annotations() {
        }

        public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
        }

        public static /* synthetic */ void getCompoundKeyHash$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getCurrentMarker$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getDefaultsInvalid$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getInserting$annotations() {
        }

        public static /* synthetic */ void getRecomposeScope$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getSkipping$annotations() {
        }
    }
}
