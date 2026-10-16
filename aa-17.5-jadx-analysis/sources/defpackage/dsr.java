package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class dsr {
    public dsr() {
    }

    static int h(Notification.Action action) {
        return action.getEmphasisHint();
    }

    static int i(Notification.Action action) {
        return action.getStyleHint();
    }

    public static int j(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static dst k(Notification notification, int i) {
        dum[] dumVarArr;
        int iH;
        int i2;
        Notification.Action action = notification.actions[i];
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompatD = null;
        if (remoteInputs == null) {
            dumVarArr = null;
        } else {
            dum[] dumVarArr2 = new dum[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                RemoteInput remoteInput = remoteInputs[i3];
                dumVarArr2[i3] = new dum(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            dumVarArr = dumVarArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = action.getSemanticAction();
        boolean zIsContextual = Build.VERSION.SDK_INT >= 29 ? action.isContextual() : false;
        if (Build.VERSION.SDK_INT >= 37) {
            iH = h(action);
            i2 = i(action);
        } else {
            iH = 0;
            i2 = 0;
        }
        boolean zA = Build.VERSION.SDK_INT >= 31 ? dsq.a(action) : false;
        if (action.getIcon() == null && action.icon != 0) {
            return new dst(action.icon, action.title, action.actionIntent, action.getExtras(), dumVarArr, z, semanticAction, z2, zIsContextual, iH, i2, zA);
        }
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            if (dtk.d(icon) != 2 || dtk.c(icon) != 0) {
                iconCompatD = dtj.d(icon);
            }
        }
        return new dst(iconCompatD, action.title, action.actionIntent, action.getExtras(), dumVarArr, z, semanticAction, z2, zIsContextual, iH, i2, zA);
    }

    public static boolean l(eac eacVar, KeyEvent keyEvent) {
        if (eacVar == null) {
            return false;
        }
        return eacVar.gF(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fjc m(byte[] bArr) {
        Object utf;
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return fjc.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    affa.n(objectInputStream, null);
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new IllegalStateException(a.bp(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new IllegalStateException(a.bp(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        if (b == 0) {
                            utf = null;
                        } else if (b == 1) {
                            utf = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else if (b == 8) {
                            int i5 = dataInputStream.readInt();
                            Boolean[] boolArr = new Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                boolArr[i6] = Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            utf = (Serializable) boolArr;
                        } else if (b == 9) {
                            int i7 = dataInputStream.readInt();
                            Byte[] bArr3 = new Byte[i7];
                            for (int i8 = 0; i8 < i7; i8++) {
                                bArr3[i8] = Byte.valueOf(dataInputStream.readByte());
                            }
                            utf = (Serializable) bArr3;
                        } else if (b == 10) {
                            int i9 = dataInputStream.readInt();
                            Integer[] numArr = new Integer[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                            }
                            utf = (Serializable) numArr;
                        } else if (b == 11) {
                            int i11 = dataInputStream.readInt();
                            Long[] lArr = new Long[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                lArr[i12] = Long.valueOf(dataInputStream.readLong());
                            }
                            utf = (Serializable) lArr;
                        } else if (b == 12) {
                            int i13 = dataInputStream.readInt();
                            Float[] fArr = new Float[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                fArr[i14] = Float.valueOf(dataInputStream.readFloat());
                            }
                            utf = (Serializable) fArr;
                        } else if (b == 13) {
                            int i15 = dataInputStream.readInt();
                            Double[] dArr = new Double[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                dArr[i16] = Double.valueOf(dataInputStream.readDouble());
                            }
                            utf = (Serializable) dArr;
                        } else {
                            if (b != 14) {
                                throw new IllegalStateException(a.bp(b, "Unsupported type "));
                            }
                            int i17 = dataInputStream.readInt();
                            String[] strArr = new String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                String utf2 = dataInputStream.readUTF();
                                if (true == affa.f(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    utf2 = null;
                                }
                                strArr[i18] = utf2;
                            }
                            utf = (Serializable) strArr;
                        }
                        linkedHashMap.put(dataInputStream.readUTF(), utf);
                    }
                    affa.n(dataInputStream, null);
                } finally {
                }
            }
        } catch (IOException e) {
            String str = fjd.a;
            fjo.a();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = fjd.a;
            fjo.a();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new fjc(linkedHashMap);
    }

    public static byte[] n(fjc fjcVar) {
        int i;
        fjcVar.getClass();
        int i2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                Map map = fjcVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(affw.b(value.getClass()).getSimpleName())));
                        }
                        Object[] objArr = (Object[]) value;
                        afhe afheVarB = affw.b(objArr.getClass());
                        int i4 = 11;
                        int i5 = 10;
                        int i6 = 8;
                        if (affa.f(afheVarB, affw.b(Boolean[].class))) {
                            i = 8;
                        } else if (affa.f(afheVarB, affw.b(Byte[].class))) {
                            i = 9;
                        } else if (affa.f(afheVarB, affw.b(Integer[].class))) {
                            i = 10;
                        } else if (affa.f(afheVarB, affw.b(Long[].class))) {
                            i = 11;
                        } else if (affa.f(afheVarB, affw.b(Float[].class))) {
                            i = 12;
                        } else if (affa.f(afheVarB, affw.b(Double[].class))) {
                            i = 13;
                        } else {
                            if (!affa.f(afheVarB, affw.b(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(affw.b(objArr.getClass()).getQualifiedName())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i7 = i2;
                        while (i7 < length) {
                            Object obj = objArr[i7];
                            if (i == i6) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i5) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i4) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 == null) {
                                    str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str2);
                            }
                            i7++;
                            i6 = 8;
                            i4 = 11;
                            i5 = 10;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 0;
                    i3 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                affa.n(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            String str3 = fjd.a;
            fjo.a();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static fjc o(Map map) {
        fjc fjcVar = new fjc(map);
        n(fjcVar);
        return fjcVar;
    }

    public static void p(Map map, Map map2) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                afhe afheVarB = affw.b(value.getClass());
                if (!affa.f(afheVarB, affw.b(Boolean.TYPE)) && !affa.f(afheVarB, affw.b(Byte.TYPE)) && !affa.f(afheVarB, affw.b(Integer.TYPE)) && !affa.f(afheVarB, affw.b(Long.TYPE)) && !affa.f(afheVarB, affw.b(Float.TYPE)) && !affa.f(afheVarB, affw.b(Double.TYPE)) && !affa.f(afheVarB, affw.b(String.class)) && !affa.f(afheVarB, affw.b(Boolean[].class)) && !affa.f(afheVarB, affw.b(Byte[].class)) && !affa.f(afheVarB, affw.b(Integer[].class)) && !affa.f(afheVarB, affw.b(Long[].class)) && !affa.f(afheVarB, affw.b(Float[].class)) && !affa.f(afheVarB, affw.b(Double[].class)) && !affa.f(afheVarB, affw.b(String[].class))) {
                    int i = 0;
                    if (affa.f(afheVarB, affw.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = fjd.a;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (affa.f(afheVarB, affw.b(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        String str3 = fjd.a;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (affa.f(afheVarB, affw.b(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        String str4 = fjd.a;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (affa.f(afheVarB, affw.b(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        String str5 = fjd.a;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (affa.f(afheVarB, affw.b(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        String str6 = fjd.a;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!affa.f(afheVarB, affw.b(double[].class))) {
                            throw new IllegalArgumentException(a.by(afheVarB, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        String str7 = fjd.a;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }

    public View a(MenuItem menuItem) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(ajmd ajmdVar) {
        throw null;
    }

    public dsr(byte[] bArr) {
    }

    public void b(SubMenu subMenu) {
    }
}
