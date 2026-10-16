package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahmc extends ahok implements ahph {
    private int bitField0_;
    private int predefinedIndex_;
    private int range_ = 1;
    private Object string_ = "";
    private ahme operation_ = ahme.NONE;
    private List<Integer> substringIndex_ = Collections.EMPTY_LIST;
    private List<Integer> replaceChar_ = Collections.EMPTY_LIST;

    private ahmc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahmc create() {
        return new ahmc();
    }

    private void ensureReplaceCharIsMutable() {
        if ((this.bitField0_ & 32) != 32) {
            this.replaceChar_ = new ArrayList(this.replaceChar_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureSubstringIndexIsMutable() {
        if ((this.bitField0_ & 16) != 16) {
            this.substringIndex_ = new ArrayList(this.substringIndex_);
            this.bitField0_ |= 16;
        }
    }

    @Override // defpackage.ahpf
    public ahmf build() {
        ahmf ahmfVarBuildPartial = buildPartial();
        if (ahmfVarBuildPartial.isInitialized()) {
            return ahmfVarBuildPartial;
        }
        throw newUninitializedMessageException(ahmfVarBuildPartial);
    }

    public ahmf buildPartial() {
        ahmf ahmfVar = new ahmf(this);
        int i = this.bitField0_;
        int i2 = i & 1;
        ahmfVar.range_ = this.range_;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ahmfVar.predefinedIndex_ = this.predefinedIndex_;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ahmfVar.string_ = this.string_;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ahmfVar.operation_ = this.operation_;
        if ((this.bitField0_ & 16) == 16) {
            this.substringIndex_ = DesugarCollections.unmodifiableList(this.substringIndex_);
            this.bitField0_ &= -17;
        }
        ahmfVar.substringIndex_ = this.substringIndex_;
        if ((this.bitField0_ & 32) == 32) {
            this.replaceChar_ = DesugarCollections.unmodifiableList(this.replaceChar_);
            this.bitField0_ &= -33;
        }
        ahmfVar.replaceChar_ = this.replaceChar_;
        ahmfVar.bitField0_ = i2;
        return ahmfVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahmc mo86clone() {
        ahmc ahmcVarCreate = create();
        ahmcVarCreate.mergeFrom(buildPartial());
        return ahmcVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahmf getDefaultInstanceForType() {
        return ahmf.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahmc mergeFrom(ahmf ahmfVar) {
        if (ahmfVar == ahmf.getDefaultInstance()) {
            return this;
        }
        if (ahmfVar.hasRange()) {
            setRange(ahmfVar.getRange());
        }
        if (ahmfVar.hasPredefinedIndex()) {
            setPredefinedIndex(ahmfVar.getPredefinedIndex());
        }
        if (ahmfVar.hasString()) {
            this.bitField0_ |= 4;
            this.string_ = ahmfVar.string_;
        }
        if (ahmfVar.hasOperation()) {
            setOperation(ahmfVar.getOperation());
        }
        if (!ahmfVar.substringIndex_.isEmpty()) {
            if (this.substringIndex_.isEmpty()) {
                this.substringIndex_ = ahmfVar.substringIndex_;
                this.bitField0_ &= -17;
            } else {
                ensureSubstringIndexIsMutable();
                this.substringIndex_.addAll(ahmfVar.substringIndex_);
            }
        }
        if (!ahmfVar.replaceChar_.isEmpty()) {
            if (this.replaceChar_.isEmpty()) {
                this.replaceChar_ = ahmfVar.replaceChar_;
                this.bitField0_ &= -33;
            } else {
                ensureReplaceCharIsMutable();
                this.replaceChar_.addAll(ahmfVar.replaceChar_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahmfVar.unknownFields));
        return this;
    }

    public ahmc setOperation(ahme ahmeVar) {
        ahmeVar.getClass();
        this.bitField0_ |= 8;
        this.operation_ = ahmeVar;
        return this;
    }

    public ahmc setPredefinedIndex(int i) {
        this.bitField0_ |= 2;
        this.predefinedIndex_ = i;
        return this;
    }

    public ahmc setRange(int i) {
        this.bitField0_ |= 1;
        this.range_ = i;
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
    public defpackage.ahmc mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahmf> r0 = defpackage.ahmf.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahmf r2 = (defpackage.ahmf) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahmf r3 = (defpackage.ahmf) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmc.mergeFrom(ahoc, ahog):ahmc");
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
        mergeFrom((ahmf) ahoqVar);
        return this;
    }
}
