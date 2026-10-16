package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    private Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m8218boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m4019copypvPzIIM(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4020getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m4021getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m4022getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m4023getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m4024getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m4025getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m4026getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m4027getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m4028getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m4029getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m4030getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m4031getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material, reason: not valid java name */
    public final void m4032setBackground8_81llA$material(long j2) {
        this.background$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setError-8_81llA$material, reason: not valid java name */
    public final void m4033setError8_81llA$material(long j2) {
        this.error$delegate.setValue(Color.m8218boximpl(j2));
    }

    public final void setLight$material(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setOnBackground-8_81llA$material, reason: not valid java name */
    public final void m4034setOnBackground8_81llA$material(long j2) {
        this.onBackground$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setOnError-8_81llA$material, reason: not valid java name */
    public final void m4035setOnError8_81llA$material(long j2) {
        this.onError$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setOnPrimary-8_81llA$material, reason: not valid java name */
    public final void m4036setOnPrimary8_81llA$material(long j2) {
        this.onPrimary$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setOnSecondary-8_81llA$material, reason: not valid java name */
    public final void m4037setOnSecondary8_81llA$material(long j2) {
        this.onSecondary$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setOnSurface-8_81llA$material, reason: not valid java name */
    public final void m4038setOnSurface8_81llA$material(long j2) {
        this.onSurface$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setPrimary-8_81llA$material, reason: not valid java name */
    public final void m4039setPrimary8_81llA$material(long j2) {
        this.primary$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material, reason: not valid java name */
    public final void m4040setPrimaryVariant8_81llA$material(long j2) {
        this.primaryVariant$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setSecondary-8_81llA$material, reason: not valid java name */
    public final void m4041setSecondary8_81llA$material(long j2) {
        this.secondary$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material, reason: not valid java name */
    public final void m4042setSecondaryVariant8_81llA$material(long j2) {
        this.secondaryVariant$delegate.setValue(Color.m8218boximpl(j2));
    }

    /* renamed from: setSurface-8_81llA$material, reason: not valid java name */
    public final void m4043setSurface8_81llA$material(long j2) {
        this.surface$delegate.setValue(Color.m8218boximpl(j2));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) Color.m8236toStringimpl(m4027getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m8236toStringimpl(m4028getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m8236toStringimpl(m4029getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m8236toStringimpl(m4030getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m8236toStringimpl(m4020getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m8236toStringimpl(m4031getSurface0d7_KjU())) + ", error=" + ((Object) Color.m8236toStringimpl(m4021getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m8236toStringimpl(m4024getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m8236toStringimpl(m4025getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m8236toStringimpl(m4022getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m8236toStringimpl(m4026getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m8236toStringimpl(m4023getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    public /* synthetic */ Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z);
    }
}
