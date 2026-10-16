package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahma extends ahok implements ahph {
    private int bitField0_;
    private List<ahmf> record_ = Collections.EMPTY_LIST;
    private List<Integer> localName_ = Collections.EMPTY_LIST;

    private ahma() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahma create() {
        return new ahma();
    }

    private void ensureLocalNameIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.localName_ = new ArrayList(this.localName_);
            this.bitField0_ |= 2;
        }
    }

    private void ensureRecordIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.record_ = new ArrayList(this.record_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahmg build() {
        ahmg ahmgVarBuildPartial = buildPartial();
        if (ahmgVarBuildPartial.isInitialized()) {
            return ahmgVarBuildPartial;
        }
        throw newUninitializedMessageException(ahmgVarBuildPartial);
    }

    public ahmg buildPartial() {
        ahmg ahmgVar = new ahmg(this);
        if ((this.bitField0_ & 1) == 1) {
            this.record_ = DesugarCollections.unmodifiableList(this.record_);
            this.bitField0_ &= -2;
        }
        ahmgVar.record_ = this.record_;
        if ((this.bitField0_ & 2) == 2) {
            this.localName_ = DesugarCollections.unmodifiableList(this.localName_);
            this.bitField0_ &= -3;
        }
        ahmgVar.localName_ = this.localName_;
        return ahmgVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahma mo86clone() {
        ahma ahmaVarCreate = create();
        ahmaVarCreate.mergeFrom(buildPartial());
        return ahmaVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahmg getDefaultInstanceForType() {
        return ahmg.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahma mergeFrom(ahmg ahmgVar) {
        if (ahmgVar == ahmg.getDefaultInstance()) {
            return this;
        }
        if (!ahmgVar.record_.isEmpty()) {
            if (this.record_.isEmpty()) {
                this.record_ = ahmgVar.record_;
                this.bitField0_ &= -2;
            } else {
                ensureRecordIsMutable();
                this.record_.addAll(ahmgVar.record_);
            }
        }
        if (!ahmgVar.localName_.isEmpty()) {
            if (this.localName_.isEmpty()) {
                this.localName_ = ahmgVar.localName_;
                this.bitField0_ &= -3;
            } else {
                ensureLocalNameIsMutable();
                this.localName_.addAll(ahmgVar.localName_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahmgVar.unknownFields));
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
    public defpackage.ahma mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahmg> r0 = defpackage.ahmg.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahmg r2 = (defpackage.ahmg) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahmg r3 = (defpackage.ahmg) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahma.mergeFrom(ahoc, ahog):ahma");
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
        mergeFrom((ahmg) ahoqVar);
        return this;
    }
}
