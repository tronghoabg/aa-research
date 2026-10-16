package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uja implements Serializable {
    public final String b;
    public final yfq c;
    public final uvy d;
    public final int e;
    public transient Bitmap f;
    public final uvy g;
    private static final yob h = yob.c("com/google/android/libraries/geo/mapcore/internal/model/Icon");
    public static final uvy a = new uvy(0, 0);

    public uja(yfq yfqVar, int i, uvy uvyVar) {
        if (i <= 0) {
            ((ynz) h.a(uys.a).ai(9375)).w("superSampleRatio must be greater than or equal to %s.", 1);
        }
        this.c = yfqVar;
        this.e = Math.max(i, 1);
        this.b = null;
        this.f = null;
        this.d = a;
        this.g = uvyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uja a(abjd abjdVar) {
        yfl yflVarJ = yfq.j(abjdVar.b.size());
        uvy uvyVar = a;
        Iterator<E> it = abjdVar.b.iterator();
        uvy uvyVar2 = null;
        int i = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            abjc abjcVar = (abjc) it.next();
            uix uixVarA = uiy.a();
            abid abidVar = abjcVar.c;
            if (abidVar == null) {
                abidVar = abid.a;
            }
            uixVarA.f(abidVar.b == 1 ? (String) abidVar.c : "");
            uixVarA.d((abjcVar.b & 256) != 0 ? abjcVar.h : -16777216);
            uixVarA.b((abjcVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? abjcVar.i : 0);
            uixVarA.e(new uiz(abjcVar.l, abjcVar.j, abjcVar.m, abjcVar.k));
            yflVarJ.i(uixVarA.a());
            if (i == -1) {
                i = (abjcVar.b & 2) != 0 ? (int) abjcVar.d : -1;
            }
            abjq abjqVar = abjcVar.g;
            if (abjqVar == null) {
                abjqVar = abjq.a;
            }
            if ((abjqVar.b & 1) != 0) {
                abjq abjqVar2 = abjcVar.g;
                if (abjqVar2 == null) {
                    abjqVar2 = abjq.a;
                }
                abka abkaVar = abjqVar2.c;
                if (abkaVar == null) {
                    abkaVar = abka.a;
                }
                if (abkaVar.c > BitmapDescriptorFactory.HUE_RED) {
                    abjq abjqVar3 = abjcVar.g;
                    abka abkaVar2 = (abjqVar3 == null ? abjq.a : abjqVar3).c;
                    if (abkaVar2 == null) {
                        abkaVar2 = abka.a;
                    }
                    if (abkaVar2.d > BitmapDescriptorFactory.HUE_RED) {
                        abka abkaVar3 = (abjqVar3 == null ? abjq.a : abjqVar3).c;
                        if (abkaVar3 == null) {
                            abkaVar3 = abka.a;
                        }
                        int i2 = (int) abkaVar3.c;
                        if (abjqVar3 == null) {
                            abjqVar3 = abjq.a;
                        }
                        abka abkaVar4 = abjqVar3.c;
                        if (abkaVar4 == null) {
                            abkaVar4 = abka.a;
                        }
                        uvyVar2 = new uvy(i2, (int) abkaVar4.d);
                    }
                }
            }
            if (!uvyVar.a()) {
                int i3 = abjcVar.b;
                if ((i3 & 4) != 0 && (i3 & 8) != 0) {
                    uvyVar = new uvy(abjcVar.e, abjcVar.f);
                }
            }
        }
        int iMax = Math.max(i, 1);
        if (abjdVar.b.size() == 1) {
            abid abidVar2 = ((abjc) abjdVar.b.get(0)).c;
            if (abidVar2 == null) {
                abidVar2 = abid.a;
            }
            String str = abidVar2.b == 1 ? (String) abidVar2.c : "";
            if (str.endsWith(".svg")) {
                return new uja(str, uvyVar, iMax);
            }
        }
        return new uja(yflVarJ.g(), iMax, uvyVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uja b(Collection collection) {
        uvy uvyVar = a;
        yfl yflVarJ = yfq.j(collection.size());
        Iterator it = collection.iterator();
        int i = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            abbz abbzVar = (abbz) it.next();
            uix uixVarA = uiy.a();
            uixVarA.f(abbzVar.c);
            uixVarA.g(abbzVar.d);
            uixVarA.d((abbzVar.b & 2048) != 0 ? abbzVar.n : -16777216);
            uixVarA.c(abbzVar.o);
            uixVarA.b((abbzVar.b & 8192) != 0 ? abbzVar.p : 0);
            uixVarA.e(new uiz(abbzVar.l, abbzVar.j, abbzVar.m, abbzVar.k));
            yflVarJ.i(uixVarA.a());
            if (i == -1) {
                i = (abbzVar.b & 8) != 0 ? abbzVar.f : -1;
            }
            if (!uvyVar.a()) {
                int i2 = abbzVar.b;
                if ((i2 & 32) != 0 && (i2 & 64) != 0) {
                    uvyVar = new uvy(abbzVar.h, abbzVar.i);
                }
            }
        }
        int iMax = Math.max(i, 1);
        yfq yfqVarG = yflVarJ.g();
        if (((yls) yfqVarG).c == 1) {
            String str = ((uiy) yfqVarG.get(0)).b;
            if (str.endsWith(".svg")) {
                return new uja(str, uvyVar, iMax);
            }
        }
        return new uja(yfqVarG, iMax, (uvy) null);
    }

    public static uja c(List list, Collection collection, aehj aehjVar, abfk abfkVar) throws ClassNotFoundException, abon {
        yfl yflVarJ = yfq.j(collection.size() + list.size());
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            int iIntValue = ((Integer) list.get(i)).intValue();
            abbz abbzVar = abbz.a;
            abpc abpcVarL = abnv.L(abbz.class);
            byte[] bArr = abfkVar.s;
            abfo abfoVar = abfkVar.j;
            abbz abbzVar2 = (abbz) abpcVarL.k(bArr, abfoVar.b(iIntValue), abfoVar.a(iIntValue), abfkVar.a);
            if (aehjVar.c(iIntValue)) {
                yflVarJ.i((uiy) aehjVar.p(iIntValue));
            } else {
                String strA = ukv.a(abbzVar2.c, (abbzVar2.b & 4) != 0, abbzVar2.e, abfkVar);
                uix uixVarA = uiy.a();
                uixVarA.f(strA);
                uixVarA.g(abbzVar2.d);
                uixVarA.d((abbzVar2.b & 2048) != 0 ? abbzVar2.n : -16777216);
                uixVarA.c(abbzVar2.o);
                uixVarA.b((abbzVar2.b & 8192) != 0 ? abbzVar2.p : 0);
                uixVarA.e(new uiz(abbzVar2.l, abbzVar2.j, abbzVar2.m, abbzVar2.k));
                uiy uiyVarA = uixVarA.a();
                aehjVar.a(iIntValue, uiyVarA);
                yflVarJ.i(uiyVarA);
            }
            if (i2 == -1) {
                i2 = (abbzVar2.b & 8) != 0 ? abbzVar2.f : -1;
            }
            i++;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            abbz abbzVar3 = (abbz) it.next();
            String strA2 = ukv.a(abbzVar3.c, (abbzVar3.b & 4) != 0, abbzVar3.e, abfkVar);
            uix uixVarA2 = uiy.a();
            uixVarA2.f(strA2);
            uixVarA2.g(abbzVar3.d);
            uixVarA2.d((abbzVar3.b & 2048) != 0 ? abbzVar3.n : -16777216);
            uixVarA2.c(abbzVar3.o);
            uixVarA2.b((abbzVar3.b & 8192) != 0 ? abbzVar3.p : 0);
            uixVarA2.e(new uiz(abbzVar3.l, abbzVar3.j, abbzVar3.m, abbzVar3.k));
            yflVarJ.i(uixVarA2.a());
            if (i2 == -1) {
                i2 = (abbzVar3.b & 8) != 0 ? abbzVar3.f : -1;
            }
        }
        return new uja(yflVarJ.g(), Math.max(i2, 1), (uvy) null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i == 0) {
            this.f = null;
            return;
        }
        byte[] bArr = new byte[i];
        objectInputStream.readFully(bArr);
        ClassLoader classLoader = getClass().getClassLoader();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, i);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        this.f = (Bitmap) parcelable;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(bitmap, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        objectOutputStream.writeInt(bArrMarshall.length);
        objectOutputStream.write(bArrMarshall);
    }

    public final boolean d() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uja)) {
            return false;
        }
        uja ujaVar = (uja) obj;
        return Objects.equals(this.b, ujaVar.b) && Objects.equals(this.c, ujaVar.c) && Objects.equals(this.f, ujaVar.f) && this.e == ujaVar.e && Objects.equals(this.d, ujaVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() + 31 : 1;
        yfq yfqVar = this.c;
        if (yfqVar != null) {
            iHashCode = (iHashCode * 31) + yfqVar.hashCode();
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            iHashCode = (iHashCode * 31) + bitmap.hashCode();
        }
        uvy uvyVar = this.g;
        if (uvyVar != null) {
            iHashCode = (iHashCode * 31) + uvyVar.hashCode();
        }
        return (((iHashCode * 31) + this.e) * 31) + this.d.hashCode();
    }

    public uja(Bitmap bitmap) {
        this.b = null;
        this.e = 1;
        this.c = null;
        this.f = bitmap;
        this.d = a;
        this.g = null;
    }

    private uja(String str, uvy uvyVar, int i) {
        if (i <= 0) {
            ((ynz) h.a(uys.a).ai(9376)).w("superSampleRatio must be greater than or equal to %s.", 1);
        }
        this.b = str;
        this.e = Math.max(i, 1);
        this.c = null;
        this.f = null;
        this.d = uvyVar;
        this.g = null;
    }
}
