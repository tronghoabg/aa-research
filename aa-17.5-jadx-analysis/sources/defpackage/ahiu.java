package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahiu extends ahok implements ahph {
    private int bitField0_;
    private List<ahiz> qualifiedName_ = Collections.EMPTY_LIST;

    private ahiu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahiu create() {
        return new ahiu();
    }

    private void ensureQualifiedNameIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.qualifiedName_ = new ArrayList(this.qualifiedName_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahja build() {
        ahja ahjaVarBuildPartial = buildPartial();
        if (ahjaVarBuildPartial.isInitialized()) {
            return ahjaVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjaVarBuildPartial);
    }

    public ahja buildPartial() {
        ahja ahjaVar = new ahja(this, (ahgm) null);
        if ((this.bitField0_ & 1) == 1) {
            this.qualifiedName_ = DesugarCollections.unmodifiableList(this.qualifiedName_);
            this.bitField0_ &= -2;
        }
        ahjaVar.qualifiedName_ = this.qualifiedName_;
        return ahjaVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahiu mo86clone() {
        ahiu ahiuVarCreate = create();
        ahiuVarCreate.mergeFrom(buildPartial());
        return ahiuVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahja getDefaultInstanceForType() {
        return ahja.getDefaultInstance();
    }

    public ahiz getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahiu mergeFrom(ahja ahjaVar) {
        if (ahjaVar == ahja.getDefaultInstance()) {
            return this;
        }
        if (!ahjaVar.qualifiedName_.isEmpty()) {
            if (this.qualifiedName_.isEmpty()) {
                this.qualifiedName_ = ahjaVar.qualifiedName_;
                this.bitField0_ &= -2;
            } else {
                ensureQualifiedNameIsMutable();
                this.qualifiedName_.addAll(ahjaVar.qualifiedName_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahjaVar.unknownFields));
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
    public defpackage.ahiu mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahja> r0 = defpackage.ahja.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahja r2 = (defpackage.ahja) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahja r3 = (defpackage.ahja) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahiu.mergeFrom(ahoc, ahog):ahiu");
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
        mergeFrom((ahja) ahoqVar);
        return this;
    }
}
