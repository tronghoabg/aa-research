package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbc {
    public static final android.view.MotionEvent a(long j, long j2, int i, int i2, android.view.MotionEvent.PointerProperties[] pointerPropertiesArr, android.view.MotionEvent.PointerCoords[] pointerCoordsArr, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9) {
        android.view.MotionEvent motionEventM = axd$.ExternalSyntheticApiModelOutline0.m(j, j2, i, i2, pointerPropertiesArr, pointerCoordsArr, i3, i4, f, f2, i5, i6, i7, 0, i8, i9);
        motionEventM.getClass();
        return motionEventM;
    }

    public static final android.view.View b(defpackage.dau dauVar, int i) {
        java.lang.Object next;
        java.util.Iterator it = dauVar.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((defpackage.cxl) ((java.util.Map.Entry) next).getKey()).c != i);
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (defpackage.dmm) entry.getValue();
        }
        return null;
    }

    public static final dcg c(java.util.List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((dcg) list.get(i2)).a == i) {
                return (dcg) list.get(i2);
            }
        }
        return null;
    }

    public static final defpackage.dga d(defpackage.ddz ddzVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ddn ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.a);
        if (ddnVar == null || !((java.lang.Boolean) ((defpackage.affc) ddnVar.b).invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (defpackage.dga) defpackage.afga.aB(arrayList);
    }

    public static final java.lang.String e(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i != 5) {
            return null;
        }
        return "android.widget.ImageView";
    }

    public static final java.lang.String f(java.lang.Object obj) {
        java.lang.String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        java.lang.String str = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        str.getClass();
        return defpackage.a.bI(str, name, "@");
    }

    public static /* synthetic */ defpackage.zhs g(defpackage.afdo afdoVar, defpackage.affg affgVar) {
        afdoVar.getClass();
        return defpackage.dlv.n(new fkg(afdoVar, affgVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fjj h(byte[] bArr) {
        java.lang.Object utf;
        int length = bArr.length;
        if (length > 10240) {
            throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return fjj.a;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    defpackage.afga.n(objectInputStream, null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.afga.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new java.lang.IllegalStateException(defpackage.a.bo(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new java.lang.IllegalStateException(defpackage.a.bo(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        if (b == 0) {
                            utf = null;
                        } else if (b == 1) {
                            utf = java.lang.Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = java.lang.Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = java.lang.Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = java.lang.Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = java.lang.Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = java.lang.Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else if (b == 8) {
                            int i5 = dataInputStream.readInt();
                            java.lang.Boolean[] boolArr = new java.lang.Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                boolArr[i6] = java.lang.Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            utf = (java.io.Serializable) boolArr;
                        } else if (b == 9) {
                            int i7 = dataInputStream.readInt();
                            java.lang.Byte[] bArr3 = new java.lang.Byte[i7];
                            for (int i8 = 0; i8 < i7; i8++) {
                                bArr3[i8] = java.lang.Byte.valueOf(dataInputStream.readByte());
                            }
                            utf = (java.io.Serializable) bArr3;
                        } else if (b == 10) {
                            int i9 = dataInputStream.readInt();
                            java.lang.Integer[] numArr = new java.lang.Integer[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                numArr[i10] = java.lang.Integer.valueOf(dataInputStream.readInt());
                            }
                            utf = (java.io.Serializable) numArr;
                        } else if (b == 11) {
                            int i11 = dataInputStream.readInt();
                            java.lang.Long[] lArr = new java.lang.Long[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                lArr[i12] = java.lang.Long.valueOf(dataInputStream.readLong());
                            }
                            utf = (java.io.Serializable) lArr;
                        } else if (b == 12) {
                            int i13 = dataInputStream.readInt();
                            java.lang.Float[] fArr = new java.lang.Float[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                fArr[i14] = java.lang.Float.valueOf(dataInputStream.readFloat());
                            }
                            utf = (java.io.Serializable) fArr;
                        } else if (b == 13) {
                            int i15 = dataInputStream.readInt();
                            java.lang.Double[] dArr = new java.lang.Double[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                dArr[i16] = java.lang.Double.valueOf(dataInputStream.readDouble());
                            }
                            utf = (java.io.Serializable) dArr;
                        } else {
                            if (b != 14) {
                                throw new java.lang.IllegalStateException(defpackage.a.bo(b, "Unsupported type "));
                            }
                            int i17 = dataInputStream.readInt();
                            java.lang.String[] strArr = new java.lang.String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                java.lang.String utf2 = dataInputStream.readUTF();
                                if (true == defpackage.afga.f(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    utf2 = null;
                                }
                                strArr[i18] = utf2;
                            }
                            utf = (java.io.Serializable) strArr;
                        }
                        linkedHashMap.put(dataInputStream.readUTF(), utf);
                    }
                    defpackage.afga.n(dataInputStream, null);
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        defpackage.afga.n(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String str = fjk.a;
            fjv.a();
            android.util.Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.String str2 = fjk.a;
            fjv.a();
            android.util.Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new fjj(linkedHashMap);
    }

    public static final byte[] i(fjj fjjVar) {
        int i;
        fjjVar.getClass();
        int i2 = 0;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                java.util.Map map = fjjVar.b;
                dataOutputStream.writeInt(map.size());
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof java.lang.Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((java.lang.Boolean) value).booleanValue());
                    } else if (value instanceof java.lang.Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((java.lang.Number) value).byteValue());
                    } else if (value instanceof java.lang.Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((java.lang.Number) value).intValue());
                    } else if (value instanceof java.lang.Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((java.lang.Number) value).longValue());
                    } else if (value instanceof java.lang.Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((java.lang.Number) value).floatValue());
                    } else if (value instanceof java.lang.Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((java.lang.Number) value).doubleValue());
                    } else if (value instanceof java.lang.String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((java.lang.String) value);
                    } else {
                        if (!(value instanceof java.lang.Object[])) {
                            throw new java.lang.IllegalArgumentException("Unsupported value type ".concat(java.lang.String.valueOf(defpackage.afgw.b(value.getClass()).getSimpleName())));
                        }
                        java.lang.Object[] objArr = (java.lang.Object[]) value;
                        defpackage.afie afieVarB = defpackage.afgw.b(objArr.getClass());
                        int i4 = 11;
                        int i5 = 10;
                        int i6 = 8;
                        if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Boolean[].class))) {
                            i = 8;
                        } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Byte[].class))) {
                            i = 9;
                        } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Integer[].class))) {
                            i = 10;
                        } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Long[].class))) {
                            i = 11;
                        } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Float[].class))) {
                            i = 12;
                        } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Double[].class))) {
                            i = 13;
                        } else {
                            if (!defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.String[].class))) {
                                throw new java.lang.IllegalArgumentException("Unsupported value type ".concat(java.lang.String.valueOf(defpackage.afgw.b(objArr.getClass()).getQualifiedName())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i7 = i2;
                        while (i7 < length) {
                            java.lang.Object obj = objArr[i7];
                            if (i == i6) {
                                java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                java.lang.Byte b = obj instanceof java.lang.Byte ? (java.lang.Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i5) {
                                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i4) {
                                java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                java.lang.Float f = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                java.lang.Double d = obj instanceof java.lang.Double ? (java.lang.Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
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
                    throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                defpackage.afga.n(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.afga.n(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String str3 = fjk.a;
            fjv.a();
            android.util.Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final fjj j(java.util.Map map) {
        fjj fjjVar = new fjj(map);
        i(fjjVar);
        return fjjVar;
    }

    public static final void k(java.util.Map map, java.util.Map map2) {
        java.lang.Object[] objArr;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                defpackage.afie afieVarB = defpackage.afgw.b(value.getClass());
                if (!defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Boolean.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Byte.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Integer.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Long.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Float.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Double.TYPE)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.String.class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Boolean[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Byte[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Integer[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Long[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Float[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.Double[].class)) && !defpackage.afga.f(afieVarB, defpackage.afgw.b(java.lang.String[].class))) {
                    int i = 0;
                    if (defpackage.afga.f(afieVarB, defpackage.afgw.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        java.lang.String str2 = fjk.a;
                        objArr = new java.lang.Boolean[length];
                        while (i < length) {
                            objArr[i] = java.lang.Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        java.lang.String str3 = fjk.a;
                        objArr = new java.lang.Byte[length2];
                        while (i < length2) {
                            objArr[i] = java.lang.Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        java.lang.String str4 = fjk.a;
                        objArr = new java.lang.Integer[length3];
                        while (i < length3) {
                            objArr[i] = java.lang.Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        java.lang.String str5 = fjk.a;
                        objArr = new java.lang.Long[length4];
                        while (i < length4) {
                            objArr[i] = java.lang.Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (defpackage.afga.f(afieVarB, defpackage.afgw.b(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        java.lang.String str6 = fjk.a;
                        objArr = new java.lang.Float[length5];
                        while (i < length5) {
                            objArr[i] = java.lang.Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!defpackage.afga.f(afieVarB, defpackage.afgw.b(double[].class))) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bx(afieVarB, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        java.lang.String str7 = fjk.a;
                        objArr = new java.lang.Double[length6];
                        while (i < length6) {
                            objArr[i] = java.lang.Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }
}
