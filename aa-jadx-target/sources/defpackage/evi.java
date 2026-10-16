package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class evi {
    private static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    private final android.content.Context b;
    private final defpackage.evw c;

    public evi(android.content.Context context, defpackage.evw evwVar) {
        evwVar.getClass();
        this.b = context;
        this.c = evwVar;
    }

    private final defpackage.evf b(android.content.res.Resources resources, android.content.res.XmlResourceParser xmlResourceParser, android.util.AttributeSet attributeSet, int i) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        java.lang.String strJ;
        java.lang.String strJ2;
        android.content.Context context;
        int depth2;
        int i2 = i;
        java.lang.String name = xmlResourceParser.getName();
        name.getClass();
        defpackage.evf evfVarA = this.c.a(name).a();
        android.content.Context context2 = this.b;
        evfVarA.a(context2, attributeSet);
        int i3 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next != 2 || depth > depth3) {
                i2 = i;
            } else {
                java.lang.String name2 = xmlResourceParser.getName();
                if (defpackage.afga.f("argument", name2)) {
                    android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, defpackage.ewe.b);
                    typedArrayObtainAttributes.getClass();
                    java.lang.String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new org.xmlpull.v1.XmlPullParserException("Arguments must have a name");
                    }
                    evfVarA.d.d.put(string, c(typedArrayObtainAttributes, resources, i2));
                    typedArrayObtainAttributes.recycle();
                } else if (defpackage.afga.f("deepLink", name2)) {
                    android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, defpackage.ewe.c);
                    typedArrayObtainAttributes2.getClass();
                    java.lang.String string2 = typedArrayObtainAttributes2.getString(3);
                    java.lang.String string3 = typedArrayObtainAttributes2.getString(i3);
                    java.lang.String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    java.lang.String strJ3 = null;
                    if (string2 != null) {
                        java.lang.String packageName = context2.getPackageName();
                        packageName.getClass();
                        strJ = afzh.J(string2, "${applicationId}", packageName);
                    } else {
                        strJ = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strJ2 = null;
                    } else {
                        java.lang.String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        strJ2 = afzh.J(string3, "${applicationId}", packageName2);
                        if (strJ2.length() <= 0) {
                            throw new java.lang.IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string4 != null) {
                        java.lang.String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        strJ3 = afzh.J(string4, "${applicationId}", packageName3);
                    }
                    evc evcVar = new evc(strJ, strJ2, strJ3);
                    eww ewwVar = evfVarA.d;
                    java.util.List listI = defpackage.ebr.i(ewwVar.d, new ewr(evcVar, 6));
                    if (!listI.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("Deep link " + evcVar.c + " can't be used to open destination " + ewwVar.a + ".\nFollowing required arguments are missing: " + listI);
                    }
                    ewwVar.c.add(evcVar);
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if (defpackage.afga.f("action", name2)) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, defpackage.ewe.a, 0, 0);
                        typedArrayObtainStyledAttributes.getClass();
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i4 = i3;
                        defpackage.eut eutVar = new defpackage.eut(typedArrayObtainStyledAttributes.getResourceId(i3, 0));
                        defpackage.evj evjVar = new defpackage.evj();
                        evjVar.a = typedArrayObtainStyledAttributes.getBoolean(4, false);
                        evjVar.b = typedArrayObtainStyledAttributes.getBoolean(10, false);
                        context = context2;
                        evjVar.b(typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false));
                        evjVar.c = typedArrayObtainStyledAttributes.getResourceId(2, -1);
                        evjVar.d = typedArrayObtainStyledAttributes.getResourceId(3, -1);
                        evjVar.e = typedArrayObtainStyledAttributes.getResourceId(5, -1);
                        evjVar.f = typedArrayObtainStyledAttributes.getResourceId(6, -1);
                        eutVar.b = evjVar.a();
                        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i4 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4 && defpackage.afga.f("argument", xmlResourceParser.getName())) {
                                android.content.res.TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, defpackage.ewe.b);
                                typedArrayObtainAttributes3.getClass();
                                java.lang.String string5 = typedArrayObtainAttributes3.getString(0);
                                if (string5 == null) {
                                    throw new org.xmlpull.v1.XmlPullParserException("Arguments must have a name");
                                }
                                defpackage.euu euuVarC = c(typedArrayObtainAttributes3, resources, i2);
                                if (euuVarC.c) {
                                    euuVarC.a(string5, bundleU);
                                }
                                typedArrayObtainAttributes3.recycle();
                            }
                            i2 = i;
                            i4 = 1;
                        }
                        if (!bundleU.isEmpty()) {
                            eutVar.c = bundleU;
                        }
                        if (!evfVarA.b()) {
                            throw new java.lang.UnsupportedOperationException("Cannot add action " + resourceId + " to " + evfVarA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        evfVarA.f.f(resourceId, eutVar);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        if (defpackage.afga.f("include", name2) && (evfVarA instanceof defpackage.evg)) {
                            android.content.res.TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, defpackage.evy.c);
                            typedArrayObtainAttributes4.getClass();
                            ((defpackage.evg) evfVarA).o(a(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (evfVarA instanceof defpackage.evg) {
                            ((defpackage.evg) evfVarA).o(b(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i2 = i;
                    context2 = context;
                    i3 = 1;
                }
            }
        }
        return evfVarA;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0228  */
    /* JADX WARN: Code duplicated, block: B:127:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x0245  */
    /* JADX WARN: Code duplicated, block: B:130:0x0256  */
    /* JADX WARN: Code duplicated, block: B:132:0x025a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0264  */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x0276  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x0280, please report this as an issue */
    private static final defpackage.euu c(android.content.res.TypedArray typedArray, android.content.res.Resources resources, int i) throws org.xmlpull.v1.XmlPullParserException {
        defpackage.evs evrVar;
        java.lang.Object objC;
        java.lang.Class<?> componentType;
        defpackage.evs evsVar;
        int[] iArr = defpackage.ewe.a;
        boolean z = false;
        boolean z2 = typedArray.getBoolean(3, false);
        java.lang.ThreadLocal threadLocal = a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        java.lang.String string = typedArray.getString(2);
        defpackage.evs evsVar2 = null;
        if (string != null) {
            defpackage.evs evsVar3 = defpackage.evs.a;
            java.lang.String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    evrVar = defpackage.ebo.m("j$" + string.substring(4), resourcePackageName);
                } catch (java.lang.RuntimeException e) {
                    if (!(e.getCause() instanceof java.lang.ClassNotFoundException)) {
                        throw e;
                    }
                    evrVar = defpackage.ebo.m(string, resourcePackageName);
                }
            } else {
                evrVar = defpackage.ebo.m(string, resourcePackageName);
            }
        } else {
            evrVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            defpackage.evs evsVar4 = defpackage.evs.b;
            if (evrVar == evsVar4) {
                if (typedValue.resourceId != 0) {
                    objC = java.lang.Integer.valueOf(typedValue.resourceId);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        java.lang.CharSequence charSequence = typedValue.string;
                        throw new org.xmlpull.v1.XmlPullParserException("unsupported value '" + ((java.lang.Object) charSequence) + "' for " + evrVar.e() + ". Must be a reference to a resource.");
                    }
                    objC = 0;
                }
            } else if (typedValue.resourceId != 0) {
                if (evrVar != null) {
                    java.lang.CharSequence charSequence2 = typedValue.string;
                    throw new org.xmlpull.v1.XmlPullParserException("unsupported value '" + ((java.lang.Object) charSequence2) + "' for " + evrVar.e() + ". You must use a \"reference\" type to reference other resources.");
                }
                objC = java.lang.Integer.valueOf(typedValue.resourceId);
                evrVar = evsVar4;
            } else if (evrVar == defpackage.evs.n) {
                objC = typedArray.getString(1);
            } else {
                int i2 = typedValue.type;
                if (i2 == 3) {
                    java.lang.String string2 = typedValue.string.toString();
                    if (evrVar == null) {
                        string2.getClass();
                        try {
                            try {
                                try {
                                    try {
                                        evsVar = defpackage.evs.a;
                                        defpackage.euf.a(string2);
                                    } catch (java.lang.IllegalArgumentException unused) {
                                        evsVar = defpackage.evs.h;
                                        evsVar.c(string2);
                                    }
                                } catch (java.lang.IllegalArgumentException unused2) {
                                    evsVar = defpackage.evs.e;
                                    evsVar.c(string2);
                                }
                            } catch (java.lang.IllegalArgumentException unused3) {
                                evsVar = defpackage.evs.n;
                            }
                        } catch (java.lang.IllegalArgumentException unused4) {
                            evsVar = defpackage.evs.k;
                            evsVar.c(string2);
                        }
                        evrVar = evsVar;
                    }
                    objC = evrVar.c(string2);
                } else if (i2 == 4) {
                    evrVar = defpackage.ebm.d(typedValue, evrVar, defpackage.evs.h, string, "float");
                    objC = java.lang.Float.valueOf(typedValue.getFloat());
                } else if (i2 == 5) {
                    evrVar = defpackage.ebm.d(typedValue, evrVar, defpackage.evs.a, string, "dimension");
                    objC = java.lang.Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                } else if (i2 == 18) {
                    evrVar = defpackage.ebm.d(typedValue, evrVar, defpackage.evs.k, string, "boolean");
                    objC = java.lang.Boolean.valueOf(typedValue.data != 0);
                } else {
                    if (typedValue.type < 16 || typedValue.type > 31) {
                        throw new org.xmlpull.v1.XmlPullParserException("unsupported argument type " + typedValue.type);
                    }
                    defpackage.evs evsVar5 = defpackage.evs.h;
                    if (evrVar == evsVar5) {
                        evrVar = defpackage.ebm.d(typedValue, evrVar, evsVar5, string, "float");
                        objC = java.lang.Float.valueOf(typedValue.data);
                    } else {
                        evrVar = defpackage.ebm.d(typedValue, evrVar, defpackage.evs.a, string, "integer");
                        objC = java.lang.Integer.valueOf(typedValue.data);
                    }
                }
            }
        } else {
            objC = null;
        }
        if (objC != null) {
            z = true;
        } else {
            objC = null;
        }
        if (evrVar == null) {
            evrVar = null;
        }
        if (evrVar == null) {
            defpackage.evs evsVar6 = defpackage.evs.a;
            if (objC instanceof java.lang.Integer) {
                evsVar2 = defpackage.evs.a;
            } else if (objC instanceof int[]) {
                evsVar2 = defpackage.evs.c;
            } else if (objC instanceof java.lang.Long) {
                evsVar2 = defpackage.evs.e;
            } else if (objC instanceof long[]) {
                evsVar2 = defpackage.evs.f;
            } else if (objC instanceof java.lang.Float) {
                evsVar2 = defpackage.evs.h;
            } else if (objC instanceof float[]) {
                evsVar2 = defpackage.evs.i;
            } else if (objC instanceof java.lang.Boolean) {
                evsVar2 = defpackage.evs.k;
            } else if (objC instanceof boolean[]) {
                evsVar2 = defpackage.evs.l;
            } else if ((objC instanceof java.lang.String) || objC == null) {
                evsVar2 = defpackage.evs.n;
            }
            if (evsVar2 != null) {
                evrVar = evsVar2;
            } else if ((objC instanceof java.lang.Object[]) && (((java.lang.Object[]) objC) instanceof java.lang.String[])) {
                evrVar = defpackage.evs.o;
            } else {
                objC.getClass();
                if (objC.getClass().isArray()) {
                    java.lang.Class<?> componentType2 = objC.getClass().getComponentType();
                    componentType2.getClass();
                    if (android.os.Parcelable.class.isAssignableFrom(componentType2)) {
                        java.lang.Class<?> componentType3 = objC.getClass().getComponentType();
                        componentType3.getClass();
                        evrVar = new evo(componentType3);
                    } else if (objC.getClass().isArray()) {
                        componentType = objC.getClass().getComponentType();
                        componentType.getClass();
                        if (java.io.Serializable.class.isAssignableFrom(componentType)) {
                            java.lang.Class<?> componentType4 = objC.getClass().getComponentType();
                            componentType4.getClass();
                            evrVar = new evq(componentType4);
                        } else if (objC instanceof android.os.Parcelable) {
                            evrVar = new evp(objC.getClass());
                        } else if (objC instanceof java.lang.Enum) {
                            evrVar = new evn(objC.getClass());
                        } else {
                            if (objC instanceof java.io.Serializable) {
                                throw new java.lang.IllegalArgumentException("Object of type " + objC.getClass().getName() + " is not supported for navigation arguments.");
                            }
                            evrVar = new evr(objC.getClass());
                        }
                    } else if (objC instanceof android.os.Parcelable) {
                        evrVar = new evp(objC.getClass());
                    } else if (objC instanceof java.lang.Enum) {
                        evrVar = new evn(objC.getClass());
                    } else {
                        if (objC instanceof java.io.Serializable) {
                            throw new java.lang.IllegalArgumentException("Object of type " + objC.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        evrVar = new evr(objC.getClass());
                    }
                } else if (objC.getClass().isArray()) {
                    componentType = objC.getClass().getComponentType();
                    componentType.getClass();
                    if (java.io.Serializable.class.isAssignableFrom(componentType)) {
                        java.lang.Class<?> componentType5 = objC.getClass().getComponentType();
                        componentType5.getClass();
                        evrVar = new evq(componentType5);
                    } else if (objC instanceof android.os.Parcelable) {
                        evrVar = new evp(objC.getClass());
                    } else if (objC instanceof java.lang.Enum) {
                        evrVar = new evn(objC.getClass());
                    } else {
                        if (objC instanceof java.io.Serializable) {
                            throw new java.lang.IllegalArgumentException("Object of type " + objC.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        evrVar = new evr(objC.getClass());
                    }
                } else if (objC instanceof android.os.Parcelable) {
                    evrVar = new evp(objC.getClass());
                } else if (objC instanceof java.lang.Enum) {
                    evrVar = new evn(objC.getClass());
                } else {
                    if (objC instanceof java.io.Serializable) {
                        throw new java.lang.IllegalArgumentException("Object of type " + objC.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    evrVar = new evr(objC.getClass());
                }
            }
        }
        return new defpackage.euu(evrVar, z2, objC, z);
    }

    public final defpackage.evg a(int i) {
        int next;
        android.content.res.Resources resources = this.b.getResources();
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        java.lang.String name = xml.getName();
                        resources.getClass();
                        attributeSetAsAttributeSet.getClass();
                        defpackage.evf evfVarB = b(resources, xml, attributeSetAsAttributeSet, i);
                        if (!(evfVarB instanceof defpackage.evg)) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bp(name, "Root element <", "> did not inflate into a NavGraph"));
                        }
                        defpackage.evg evgVar = (defpackage.evg) evfVarB;
                        xml.close();
                        return evgVar;
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (java.lang.Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }
}
