package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class akft {
    final akfr a;
    final String b;
    final int c;

    public akft(akfr akfrVar, String str, int i) {
        this.a = akfrVar;
        this.b = str;
        this.c = i;
    }

    static akft c(DataInput dataInput) throws IOException {
        return new akft(new akfr((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) ahlg.a(dataInput)), dataInput.readUTF(), (int) ahlg.a(dataInput));
    }

    public final long a(long j, int i, int i2) {
        akfr akfrVar = this.a;
        char c = akfrVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        akdr akdrVar = akdr.o;
        akcf akcfVar = akdrVar.m;
        int i3 = akfrVar.b;
        long jH = akdrVar.i.h(akcfVar.h(j3, i3), 0);
        akcf akcfVar2 = akdrVar.i;
        int i4 = akfrVar.f;
        long jA = akfrVar.a(akdrVar, akcfVar2.e(jH, Math.min(i4, 86399999)));
        if (akfrVar.d != 0) {
            jA = akfrVar.c(akdrVar, jA);
            if (jA <= j3) {
                jA = akfrVar.c(akdrVar, akfrVar.a(akdrVar, akdrVar.m.h(akdrVar.n.e(jA, 1), i3)));
            }
        } else if (jA <= j3) {
            jA = akfrVar.a(akdrVar, akdrVar.n.e(jA, 1));
        }
        return akdrVar.i.e(akdrVar.i.h(jA, 0), i4) - j2;
    }

    public final long b(long j, int i, int i2) {
        akfr akfrVar = this.a;
        char c = akfrVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        akdr akdrVar = akdr.o;
        akcf akcfVar = akdrVar.m;
        int i3 = akfrVar.b;
        long jH = akdrVar.i.h(akcfVar.h(j3, i3), 0);
        akcf akcfVar2 = akdrVar.i;
        int i4 = akfrVar.f;
        long jB = akfrVar.b(akdrVar, akcfVar2.e(jH, i4));
        if (akfrVar.d != 0) {
            jB = akfrVar.c(akdrVar, jB);
            if (jB >= j3) {
                jB = akfrVar.c(akdrVar, akfrVar.b(akdrVar, akdrVar.m.h(akdrVar.n.e(jB, -1), i3)));
            }
        } else if (jB >= j3) {
            jB = akfrVar.b(akdrVar, akdrVar.n.e(jB, -1));
        }
        return akdrVar.i.e(akdrVar.i.h(jB, 0), i4) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akft) {
            akft akftVar = (akft) obj;
            if (this.c == akftVar.c && this.b.equals(akftVar.b) && this.a.equals(akftVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
