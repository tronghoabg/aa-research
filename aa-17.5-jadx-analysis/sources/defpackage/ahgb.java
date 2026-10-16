package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahgb {
    private final String[] data;
    private final int extraInt;
    private final String extraString;
    private final String[] incompatibleData;
    private final ahga kind;
    private final ahlc metadataVersion;
    private final String packageName;
    private final String[] strings;

    public ahgb(ahga ahgaVar, ahlc ahlcVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        ahgaVar.getClass();
        ahlcVar.getClass();
        this.kind = ahgaVar;
        this.metadataVersion = ahlcVar;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
    }

    private final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }

    public final String[] getData() {
        return this.data;
    }

    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    public final ahga getKind() {
        return this.kind;
    }

    public final ahlc getMetadataVersion() {
        return this.metadataVersion;
    }

    public final String getMultifileClassName() {
        if (this.kind == ahga.MULTIFILE_CLASS_PART) {
            return this.extraString;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        String[] strArr = this.kind == ahga.MULTIFILE_CLASS ? this.data : null;
        List<String> listCD = strArr != null ? woy.cD(strArr) : null;
        return listCD == null ? afbe.a : listCD;
    }

    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return has(this.extraInt, 2);
    }

    public final boolean isUnstableJvmIrBinary() {
        int i = this.extraInt;
        return has(i, 16) && !has(i, 32);
    }

    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }
}
