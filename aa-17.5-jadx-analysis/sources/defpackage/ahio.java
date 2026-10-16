package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahio extends ahol implements ahph {
    private int bitField0_;
    private ahjf strings_ = ahjf.getDefaultInstance();
    private ahja qualifiedNames_ = ahja.getDefaultInstance();
    private ahim package_ = ahim.getDefaultInstance();
    private List<ahhc> class__ = Collections.EMPTY_LIST;
    private List<ahgx> fileAnnotation_ = Collections.EMPTY_LIST;

    private ahio() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahio create() {
        return new ahio();
    }

    private void ensureClass_IsMutable() {
        if ((this.bitField0_ & 8) != 8) {
            this.class__ = new ArrayList(this.class__);
            this.bitField0_ |= 8;
        }
    }

    private void ensureFileAnnotationIsMutable() {
        if ((this.bitField0_ & 16) != 16) {
            this.fileAnnotation_ = new ArrayList(this.fileAnnotation_);
            this.bitField0_ |= 16;
        }
    }

    @Override // defpackage.ahpf
    public ahip build() {
        ahip ahipVarBuildPartial = buildPartial();
        if (ahipVarBuildPartial.isInitialized()) {
            return ahipVarBuildPartial;
        }
        throw newUninitializedMessageException(ahipVarBuildPartial);
    }

    public ahip buildPartial() {
        ahip ahipVar = new ahip(this, (ahgm) null);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahipVar.strings_ = this.strings_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahipVar.qualifiedNames_ = this.qualifiedNames_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahipVar.package_ = this.package_;
        if ((this.bitField0_ & 8) == 8) {
            this.class__ = DesugarCollections.unmodifiableList(this.class__);
            this.bitField0_ &= -9;
        }
        ahipVar.class__ = this.class__;
        if ((this.bitField0_ & 16) == 16) {
            this.fileAnnotation_ = DesugarCollections.unmodifiableList(this.fileAnnotation_);
            this.bitField0_ &= -17;
        }
        ahipVar.fileAnnotation_ = this.fileAnnotation_;
        ahipVar.bitField0_ = i2;
        return ahipVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahio mo86clone() {
        ahio ahioVarCreate = create();
        ahioVarCreate.mergeFrom(buildPartial());
        return ahioVarCreate;
    }

    public ahhc getClass_(int i) {
        return this.class__.get(i);
    }

    public int getClass_Count() {
        return this.class__.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahip getDefaultInstanceForType() {
        return ahip.getDefaultInstance();
    }

    public ahgx getFileAnnotation(int i) {
        return this.fileAnnotation_.get(i);
    }

    public int getFileAnnotationCount() {
        return this.fileAnnotation_.size();
    }

    public ahim getPackage() {
        return this.package_;
    }

    public ahja getQualifiedNames() {
        return this.qualifiedNames_;
    }

    public boolean hasPackage() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasQualifiedNames() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
            return false;
        }
        if (hasPackage() && !getPackage().isInitialized()) {
            return false;
        }
        for (int i = 0; i < getClass_Count(); i++) {
            if (!getClass_(i).isInitialized()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getFileAnnotationCount(); i2++) {
            if (!getFileAnnotation(i2).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahio mergeFrom(ahip ahipVar) {
        if (ahipVar == ahip.getDefaultInstance()) {
            return this;
        }
        if (ahipVar.hasStrings()) {
            mergeStrings(ahipVar.getStrings());
        }
        if (ahipVar.hasQualifiedNames()) {
            mergeQualifiedNames(ahipVar.getQualifiedNames());
        }
        if (ahipVar.hasPackage()) {
            mergePackage(ahipVar.getPackage());
        }
        if (!ahipVar.class__.isEmpty()) {
            if (this.class__.isEmpty()) {
                this.class__ = ahipVar.class__;
                this.bitField0_ &= -9;
            } else {
                ensureClass_IsMutable();
                this.class__.addAll(ahipVar.class__);
            }
        }
        if (!ahipVar.fileAnnotation_.isEmpty()) {
            if (this.fileAnnotation_.isEmpty()) {
                this.fileAnnotation_ = ahipVar.fileAnnotation_;
                this.bitField0_ &= -17;
            } else {
                ensureFileAnnotationIsMutable();
                this.fileAnnotation_.addAll(ahipVar.fileAnnotation_);
            }
        }
        mergeExtensionFields(ahipVar);
        setUnknownFields(getUnknownFields().concat(ahipVar.unknownFields));
        return this;
    }

    public ahio mergePackage(ahim ahimVar) {
        if ((this.bitField0_ & 4) == 4 && this.package_ != ahim.getDefaultInstance()) {
            ahil ahilVarNewBuilder = ahim.newBuilder(this.package_);
            ahilVarNewBuilder.mergeFrom(ahimVar);
            ahimVar = ahilVarNewBuilder.buildPartial();
        }
        this.package_ = ahimVar;
        this.bitField0_ |= 4;
        return this;
    }

    public ahio mergeQualifiedNames(ahja ahjaVar) {
        if ((this.bitField0_ & 2) == 2 && this.qualifiedNames_ != ahja.getDefaultInstance()) {
            ahiu ahiuVarNewBuilder = ahja.newBuilder(this.qualifiedNames_);
            ahiuVarNewBuilder.mergeFrom(ahjaVar);
            ahjaVar = ahiuVarNewBuilder.buildPartial();
        }
        this.qualifiedNames_ = ahjaVar;
        this.bitField0_ |= 2;
        return this;
    }

    public ahio mergeStrings(ahjf ahjfVar) {
        if ((this.bitField0_ & 1) == 1 && this.strings_ != ahjf.getDefaultInstance()) {
            ahje ahjeVarNewBuilder = ahjf.newBuilder(this.strings_);
            ahjeVarNewBuilder.mergeFrom(ahjfVar);
            ahjfVar = ahjeVarNewBuilder.buildPartial();
        }
        this.strings_ = ahjfVar;
        this.bitField0_ |= 1;
        return this;
    }

    private void maybeForceBuilderInitialization() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    @Override // defpackage.ahns, defpackage.ahpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahio mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahip> r0 = defpackage.ahip.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahip r2 = (defpackage.ahip) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            if (r2 == 0) goto Ld
            r1.mergeFrom(r2)
        Ld:
            return r1
        Le:
            r2 = move-exception
            goto L1a
        L10:
            r2 = move-exception
            ahpg r3 = r2.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Le
            ahip r3 = (defpackage.ahip) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.mergeFrom(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahio.mergeFrom(ahoc, ahog):ahio");
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahns mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahpf mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahok
    public /* bridge */ /* synthetic */ ahok mergeFrom(ahoq ahoqVar) {
        mergeFrom((ahip) ahoqVar);
        return this;
    }
}
