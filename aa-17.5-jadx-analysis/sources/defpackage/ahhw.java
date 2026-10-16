package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhw extends ahol implements ahph {
    private List<ahgx> annotation_ = Collections.EMPTY_LIST;
    private int bitField0_;
    private int name_;

    private ahhw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhw create() {
        return new ahhw();
    }

    private void ensureAnnotationIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.annotation_ = new ArrayList(this.annotation_);
            this.bitField0_ |= 2;
        }
    }

    public ahhw addAnnotation(ahgx ahgxVar) {
        ahgxVar.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(ahgxVar);
        return this;
    }

    @Override // defpackage.ahpf
    public ahhx build() {
        ahhx ahhxVarBuildPartial = buildPartial();
        if (ahhxVarBuildPartial.isInitialized()) {
            return ahhxVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhxVarBuildPartial);
    }

    public ahhx buildPartial() {
        ahhx ahhxVar = new ahhx(this, (ahgm) null);
        int i = this.bitField0_ & 1;
        ahhxVar.name_ = this.name_;
        if ((this.bitField0_ & 2) == 2) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
            this.bitField0_ &= -3;
        }
        ahhxVar.annotation_ = this.annotation_;
        ahhxVar.bitField0_ = i;
        return ahhxVar;
    }

    @Override // defpackage.ahol, defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhw mo86clone() {
        ahhw ahhwVarCreate = create();
        ahhwVarCreate.mergeFrom(buildPartial());
        return ahhwVarCreate;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahhx getDefaultInstanceForType() {
        return ahhx.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getAnnotationCount(); i++) {
            if (!getAnnotation(i).isInitialized()) {
                return false;
            }
        }
        return extensionsAreInitialized();
    }

    public ahhw mergeFrom(ahhx ahhxVar) {
        if (ahhxVar == ahhx.getDefaultInstance()) {
            return this;
        }
        if (ahhxVar.hasName()) {
            setName(ahhxVar.getName());
        }
        if (!ahhxVar.annotation_.isEmpty()) {
            if (this.annotation_.isEmpty()) {
                this.annotation_ = ahhxVar.annotation_;
                this.bitField0_ &= -3;
            } else {
                ensureAnnotationIsMutable();
                this.annotation_.addAll(ahhxVar.annotation_);
            }
        }
        mergeExtensionFields(ahhxVar);
        setUnknownFields(getUnknownFields().concat(ahhxVar.unknownFields));
        return this;
    }

    public ahhw setName(int i) {
        this.bitField0_ |= 1;
        this.name_ = i;
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
    public defpackage.ahhw mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhx> r0 = defpackage.ahhx.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhx r2 = (defpackage.ahhx) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahhx r3 = (defpackage.ahhx) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhw.mergeFrom(ahoc, ahog):ahhw");
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
        mergeFrom((ahhx) ahoqVar);
        return this;
    }
}
