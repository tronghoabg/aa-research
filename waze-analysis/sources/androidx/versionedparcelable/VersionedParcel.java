package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SimpleArrayMap;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    final SimpleArrayMap<String, Class<?>> mParcelizerCache;
    final SimpleArrayMap<String, Method> mReadCache;
    final SimpleArrayMap<String, Method> mWriteCache;

    /* compiled from: WazeSource */
    /* renamed from: androidx.versionedparcelable.VersionedParcel$1, reason: invalid class name */
    class AnonymousClass1 extends ObjectInputStream implements InputStreamRetargetInterface {
        AnonymousClass1(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }
    }

    /* compiled from: WazeSource */
    final class Api21Impl {
        private Api21Impl() {
        }

        static Size readSize(VersionedParcel versionedParcel) {
            if (versionedParcel.readBoolean()) {
                return new Size(versionedParcel.readInt(), versionedParcel.readInt());
            }
            return null;
        }

        static SizeF readSizeF(VersionedParcel versionedParcel) {
            if (versionedParcel.readBoolean()) {
                return new SizeF(versionedParcel.readFloat(), versionedParcel.readFloat());
            }
            return null;
        }

        static void writeSize(VersionedParcel versionedParcel, Size size) {
            versionedParcel.writeBoolean(size != null);
            if (size != null) {
                versionedParcel.writeInt(size.getWidth());
                versionedParcel.writeInt(size.getHeight());
            }
        }

        static void writeSizeF(VersionedParcel versionedParcel, SizeF sizeF) {
            versionedParcel.writeBoolean(sizeF != null);
            if (sizeF != null) {
                versionedParcel.writeFloat(sizeF.getWidth());
                versionedParcel.writeFloat(sizeF.getHeight());
            }
        }
    }

    /* compiled from: WazeSource */
    public class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    VersionedParcel(SimpleArrayMap<String, Method> simpleArrayMap, SimpleArrayMap<String, Method> simpleArrayMap2, SimpleArrayMap<String, Class<?>> simpleArrayMap3) {
        this.mReadCache = simpleArrayMap;
        this.mWriteCache = simpleArrayMap2;
        this.mParcelizerCache = simpleArrayMap3;
    }

    private Exception createException(int i2, String str) {
        switch (i2) {
            case EX_PARCELABLE /* -9 */:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i2 + " msg " + str);
            case EX_UNSUPPORTED_OPERATION /* -7 */:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class<?> findParcelClass(Class<?> cls) throws ClassNotFoundException {
        Class<?> cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    private Method getReadMethod(String str) throws NoSuchMethodException, SecurityException {
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, false, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    protected static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int getType(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof VersionedParcelable) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(String.valueOf(t.getClass().getName()).concat(" cannot be VersionedParcelled"));
    }

    private Method getWriteMethod(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Method declaredMethod = findParcelClass(cls).getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T, S extends Collection<T>> S readCollection(S s) {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        if (i2 != 0) {
            int i3 = readInt();
            if (i3 == 1) {
                while (i2 > 0) {
                    s.add(readVersionedParcelable());
                    i2--;
                }
            } else if (i3 == 2) {
                while (i2 > 0) {
                    s.add(readParcelable());
                    i2--;
                }
            } else if (i3 == 3) {
                while (i2 > 0) {
                    s.add(readSerializable());
                    i2--;
                }
            } else if (i3 == 4) {
                while (i2 > 0) {
                    s.add(readString());
                    i2--;
                }
            } else if (i3 == 5) {
                while (i2 > 0) {
                    s.add(readStrongBinder());
                    i2--;
                }
            }
        }
        return s;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void writeSerializable(Serializable serializable) throws IOException {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e2);
        }
    }

    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(String.valueOf(versionedParcelable.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e2);
        }
    }

    protected abstract void closeField();

    protected abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    protected <T> T[] readArray(T[] tArr) {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        if (i2 != 0) {
            int i3 = readInt();
            if (i3 == 1) {
                while (i2 > 0) {
                    arrayList.add(readVersionedParcelable());
                    i2--;
                }
            } else if (i3 == 2) {
                while (i2 > 0) {
                    arrayList.add(readParcelable());
                    i2--;
                }
            } else if (i3 == 3) {
                while (i2 > 0) {
                    arrayList.add(readSerializable());
                    i2--;
                }
            } else if (i3 == 4) {
                while (i2 > 0) {
                    arrayList.add(readString());
                    i2--;
                }
            } else if (i3 == 5) {
                while (i2 > 0) {
                    arrayList.add(readStrongBinder());
                    i2--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean z, int i2) {
        return !readField(i2) ? z : readBoolean();
    }

    protected boolean[] readBooleanArray() {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            zArr[i3] = readInt() != 0;
        }
        return zArr;
    }

    protected abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i2) {
        return !readField(i2) ? bundle : readBundle();
    }

    public byte readByte(byte b2, int i2) {
        return !readField(i2) ? b2 : (byte) (readInt() & 255);
    }

    protected abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i2) {
        return !readField(i2) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i2) {
        if (!readField(i2)) {
            return cArr;
        }
        int i3 = readInt();
        if (i3 < 0) {
            return null;
        }
        char[] cArr2 = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr2[i4] = (char) readInt();
        }
        return cArr2;
    }

    protected abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i2) {
        return !readField(i2) ? charSequence : readCharSequence();
    }

    protected abstract double readDouble();

    public double readDouble(double d2, int i2) {
        return !readField(i2) ? d2 : readDouble();
    }

    protected double[] readDoubleArray() {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = readDouble();
        }
        return dArr;
    }

    public Exception readException(Exception exc, int i2) {
        int exceptionCode;
        return (readField(i2) && (exceptionCode = readExceptionCode()) != 0) ? createException(exceptionCode, readString()) : exc;
    }

    protected abstract boolean readField(int i2);

    protected abstract float readFloat();

    public float readFloat(float f2, int i2) {
        return !readField(i2) ? f2 : readFloat();
    }

    protected float[] readFloatArray() {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = readFloat();
        }
        return fArr;
    }

    protected <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e5);
        }
    }

    protected abstract int readInt();

    public int readInt(int i2, int i3) {
        return !readField(i3) ? i2 : readInt();
    }

    protected int[] readIntArray() {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = readInt();
        }
        return iArr;
    }

    public <T> List<T> readList(List<T> list, int i2) {
        return !readField(i2) ? list : (List) readCollection(new ArrayList());
    }

    protected abstract long readLong();

    public long readLong(long j2, int i2) {
        return !readField(i2) ? j2 : readLong();
    }

    protected long[] readLongArray() {
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = readLong();
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i2) {
        if (!readField(i2)) {
            return map;
        }
        int i3 = readInt();
        if (i3 < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap(i3);
        if (i3 != 0) {
            ArrayList arrayList = new ArrayList(i3);
            ArrayList arrayList2 = new ArrayList(i3);
            readCollection(arrayList);
            readCollection(arrayList2);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayMap.put(arrayList.get(i4), arrayList2.get(i4));
            }
        }
        return arrayMap;
    }

    protected abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t, int i2) {
        return !readField(i2) ? t : (T) readParcelable();
    }

    protected Serializable readSerializable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new AnonymousClass1(new ByteArrayInputStream(readByteArray())).readObject();
        } catch (IOException e2) {
            throw new RuntimeException("Unable to read Serializable object (name = " + string + ")", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Unable to read Serializable object (name = " + string + ")", e3);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i2) {
        return !readField(i2) ? set : (Set) readCollection(new ArraySet());
    }

    public Size readSize(Size size, int i2) {
        return !readField(i2) ? size : Api21Impl.readSize(this);
    }

    public SizeF readSizeF(SizeF sizeF, int i2) {
        return !readField(i2) ? sizeF : Api21Impl.readSizeF(this);
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
        if (!readField(i2)) {
            return sparseBooleanArray;
        }
        int i3 = readInt();
        if (i3 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    protected abstract String readString();

    public String readString(String str, int i2) {
        return !readField(i2) ? str : readString();
    }

    protected abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i2) {
        return !readField(i2) ? iBinder : readStrongBinder();
    }

    protected <T extends VersionedParcelable> T readVersionedParcelable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return (T) readFromParcel(string, createSubParcel());
    }

    protected abstract void setOutputField(int i2);

    public void setSerializationFlags(boolean z, boolean z2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void writeArray(T[] tArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i2 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i2 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i2]);
                    i2++;
                }
                return;
            }
            if (type == 2) {
                while (i2 < length) {
                    writeParcelable((Parcelable) tArr[i2]);
                    i2++;
                }
                return;
            }
            if (type == 3) {
                while (i2 < length) {
                    writeSerializable((Serializable) tArr[i2]);
                    i2++;
                }
            } else if (type == 4) {
                while (i2 < length) {
                    writeString((String) tArr[i2]);
                    i2++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i2 < length) {
                    writeStrongBinder((IBinder) tArr[i2]);
                    i2++;
                }
            }
        }
    }

    protected abstract void writeBoolean(boolean z);

    public void writeBoolean(boolean z, int i2) {
        setOutputField(i2);
        writeBoolean(z);
    }

    protected void writeBooleanArray(boolean[] zArr) {
        if (zArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(zArr.length);
        for (boolean z : zArr) {
            writeInt(z ? 1 : 0);
        }
    }

    protected abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i2) {
        setOutputField(i2);
        writeBundle(bundle);
    }

    public void writeByte(byte b2, int i2) {
        setOutputField(i2);
        writeInt(b2);
    }

    protected abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i2) {
        setOutputField(i2);
        writeByteArray(bArr);
    }

    protected abstract void writeByteArray(byte[] bArr, int i2, int i3);

    public void writeCharArray(char[] cArr, int i2) {
        setOutputField(i2);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c2 : cArr) {
            writeInt(c2);
        }
    }

    protected abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i2) {
        setOutputField(i2);
        writeCharSequence(charSequence);
    }

    protected abstract void writeDouble(double d2);

    public void writeDouble(double d2, int i2) {
        setOutputField(i2);
        writeDouble(d2);
    }

    protected void writeDoubleArray(double[] dArr) {
        if (dArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(dArr.length);
        for (double d2 : dArr) {
            writeDouble(d2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i2) {
        setOutputField(i2);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int i3 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? EX_PARCELABLE : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? EX_UNSUPPORTED_OPERATION : 0;
        writeInt(i3);
        if (i3 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i3 != EX_PARCELABLE) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    protected abstract void writeFloat(float f2);

    public void writeFloat(float f2, int i2) {
        setOutputField(i2);
        writeFloat(f2);
    }

    protected void writeFloatArray(float[] fArr) {
        if (fArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(fArr.length);
        for (float f2 : fArr) {
            writeFloat(f2);
        }
    }

    protected abstract void writeInt(int i2);

    public void writeInt(int i2, int i3) {
        setOutputField(i3);
        writeInt(i2);
    }

    protected void writeIntArray(int[] iArr) {
        if (iArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(iArr.length);
        for (int i2 : iArr) {
            writeInt(i2);
        }
    }

    public <T> void writeList(List<T> list, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(list, i2);
    }

    protected abstract void writeLong(long j2);

    public void writeLong(long j2, int i2) {
        setOutputField(i2);
        writeLong(j2);
    }

    protected void writeLongArray(long[] jArr) {
        if (jArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(jArr.length);
        for (long j2 : jArr) {
            writeLong(j2);
        }
    }

    public <K, V> void writeMap(Map<K, V> map, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i2);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    protected void writeNoException() {
        writeInt(0);
    }

    protected abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i2) {
        setOutputField(i2);
        writeParcelable(parcelable);
    }

    public <T> void writeSet(Set<T> set, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(set, i2);
    }

    public void writeSize(Size size, int i2) {
        setOutputField(i2);
        Api21Impl.writeSize(this, size);
    }

    public void writeSizeF(SizeF sizeF, int i2) {
        setOutputField(i2);
        Api21Impl.writeSizeF(this, sizeF);
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i2) {
        setOutputField(i2);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            writeInt(sparseBooleanArray.keyAt(i3));
            writeBoolean(sparseBooleanArray.valueAt(i3));
        }
    }

    protected abstract void writeString(String str);

    public void writeString(String str, int i2) {
        setOutputField(i2);
        writeString(str);
    }

    protected abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i2) {
        setOutputField(i2);
        writeStrongBinder(iBinder);
    }

    protected abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i2) {
        setOutputField(i2);
        writeStrongInterface(iInterface);
    }

    protected <T extends VersionedParcelable> void writeToParcel(T t, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            getWriteMethod(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new RuntimeException(e5);
            }
            throw ((Error) cause);
        }
    }

    protected void writeVersionedParcelable(VersionedParcelable versionedParcelable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        VersionedParcel versionedParcelCreateSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, versionedParcelCreateSubParcel);
        versionedParcelCreateSubParcel.closeField();
    }

    public void writeByteArray(byte[] bArr, int i2, int i3, int i4) {
        setOutputField(i4);
        writeByteArray(bArr, i2, i3);
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t, int i2) {
        return !readField(i2) ? t : (T) readVersionedParcelable();
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i2);
        writeVersionedParcelable(versionedParcelable);
    }

    public double[] readDoubleArray(double[] dArr, int i2) {
        return !readField(i2) ? dArr : readDoubleArray();
    }

    public float[] readFloatArray(float[] fArr, int i2) {
        return !readField(i2) ? fArr : readFloatArray();
    }

    public int[] readIntArray(int[] iArr, int i2) {
        return !readField(i2) ? iArr : readIntArray();
    }

    public long[] readLongArray(long[] jArr, int i2) {
        return !readField(i2) ? jArr : readLongArray();
    }

    public void writeBooleanArray(boolean[] zArr, int i2) {
        setOutputField(i2);
        writeBooleanArray(zArr);
    }

    public void writeDoubleArray(double[] dArr, int i2) {
        setOutputField(i2);
        writeDoubleArray(dArr);
    }

    public void writeFloatArray(float[] fArr, int i2) {
        setOutputField(i2);
        writeFloatArray(fArr);
    }

    public void writeIntArray(int[] iArr, int i2) {
        setOutputField(i2);
        writeIntArray(iArr);
    }

    public void writeLongArray(long[] jArr, int i2) {
        setOutputField(i2);
        writeLongArray(jArr);
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i2) {
        return !readField(i2) ? zArr : readBooleanArray();
    }

    public void writeSerializable(Serializable serializable, int i2) throws IOException {
        setOutputField(i2);
        writeSerializable(serializable);
    }

    public <T> T[] readArray(T[] tArr, int i2) {
        return !readField(i2) ? tArr : (T[]) readArray(tArr);
    }

    public <T> void writeArray(T[] tArr, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i2);
        writeArray(tArr);
    }

    private <T> void writeCollection(Collection<T> collection, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i2);
        writeCollection(collection);
    }
}
