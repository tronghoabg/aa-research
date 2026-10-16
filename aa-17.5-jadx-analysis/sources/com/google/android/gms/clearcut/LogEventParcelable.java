package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.acam;
import defpackage.sis;
import defpackage.spu;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogEventParcelable> CREATOR = new sis();
    private static final String[] p = new String[0];
    public final PlayLoggerContext a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final ExperimentTokens[] g;
    public final boolean h;
    public LogVerifierResultParcelable i;
    public final int j;
    public final DataCollectionIdentifierParcelable k;
    public BatchedLogErrorParcelable l;
    public final byte[] m;
    public final Long n;
    public final acam o;
    private final String[] q;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, LogVerifierResultParcelable logVerifierResultParcelable, String[] strArr2, int i, DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable, BatchedLogErrorParcelable batchedLogErrorParcelable, byte[] bArr3, Long l) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = experimentTokensArr;
        this.i = logVerifierResultParcelable;
        this.q = strArr2;
        this.j = i;
        this.o = null;
        this.k = dataCollectionIdentifierParcelable;
        this.l = batchedLogErrorParcelable;
        this.m = bArr3;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (Objects.equals(this.a, logEventParcelable.a) && Arrays.equals(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && Objects.equals(this.o, logEventParcelable.o) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.deepEquals(this.f, logEventParcelable.f) && Arrays.equals(this.g, logEventParcelable.g) && Arrays.equals(this.q, logEventParcelable.q) && this.h == logEventParcelable.h && Objects.equals(this.i, logEventParcelable.i) && this.j == logEventParcelable.j && Objects.equals(this.k, logEventParcelable.k) && Objects.equals(this.l, logEventParcelable.l) && Arrays.equals(this.m, logEventParcelable.m) && Objects.equals(this.n, logEventParcelable.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.o, this.e, this.f, this.g, Boolean.valueOf(this.h), this.q, this.i, Integer.valueOf(this.j), this.k, this.l, this.m, this.n});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.o);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.q));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        LogVerifierResultParcelable logVerifierResultParcelable = this.i;
        sb.append(logVerifierResultParcelable != null ? logVerifierResultParcelable.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(Arrays.toString(this.m));
        sb.append(", ");
        sb.append(this.n);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 2, this.a, i);
        byte[] bArr = this.b;
        if (bArr != null) {
            int iL2 = spu.l(parcel, 3);
            parcel.writeByteArray(bArr);
            spu.m(parcel, iL2);
        }
        int[] iArr = this.c;
        if (iArr != null) {
            int iL3 = spu.l(parcel, 4);
            parcel.writeIntArray(iArr);
            spu.m(parcel, iL3);
        }
        String[] strArr = this.d;
        if (strArr != null) {
            int iL4 = spu.l(parcel, 5);
            parcel.writeStringArray(strArr);
            spu.m(parcel, iL4);
        }
        int[] iArr2 = this.e;
        if (iArr2 != null) {
            int iL5 = spu.l(parcel, 6);
            parcel.writeIntArray(iArr2);
            spu.m(parcel, iL5);
        }
        spu.w(parcel, 7, this.f);
        boolean z = this.h;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        spu.I(parcel, 9, this.g, i);
        spu.E(parcel, 11, this.i, i);
        String[] strArr2 = this.q;
        if (strArr2 == null) {
            strArr2 = p;
        }
        int iL6 = spu.l(parcel, 12);
        parcel.writeStringArray(strArr2);
        spu.m(parcel, iL6);
        int i2 = this.j;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        spu.E(parcel, 14, this.k, i);
        spu.E(parcel, 15, this.l, i);
        byte[] bArr2 = this.m;
        if (bArr2 != null) {
            int iL7 = spu.l(parcel, 16);
            parcel.writeByteArray(bArr2);
            spu.m(parcel, iL7);
        }
        spu.D(parcel, 17, this.n);
        spu.m(parcel, iL);
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, acam acamVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, ExperimentTokens[] experimentTokensArr, String[] strArr2, int i, Long l) {
        this.a = playLoggerContext;
        this.o = acamVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = experimentTokensArr;
        this.h = true;
        this.q = strArr2;
        this.j = i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
