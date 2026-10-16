package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu {
    private static defpackage.mu b;
    private java.util.WeakHashMap c;
    private final java.util.WeakHashMap d = new java.util.WeakHashMap(0);
    private android.util.TypedValue e;
    private boolean f;
    private defpackage.jc g;
    private static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final defpackage.aab h = new defpackage.aab(6);

    public static synchronized android.graphics.PorterDuffColorFilter b(int i, android.graphics.PorterDuff.Mode mode) {
        defpackage.aab aabVar = h;
        int i2 = (i + 31) * 31;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) aabVar.b(java.lang.Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = new android.graphics.PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized defpackage.mu e() {
        defpackage.mu muVar;
        muVar = b;
        if (muVar == null) {
            muVar = new defpackage.mu();
            b = muVar;
        }
        return muVar;
    }

    static void g(android.graphics.drawable.Drawable drawable, defpackage.ng ngVar, int[] iArr) {
        android.content.res.ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilterB = null;
        if (ngVar.d) {
            colorStateList = ngVar.a;
        } else {
            if (!ngVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        android.graphics.PorterDuff.Mode mode = ngVar.c ? ngVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized android.graphics.drawable.Drawable i(android.content.Context context, long j) {
        java.lang.ref.WeakReference weakReference;
        defpackage.zz zzVar = (defpackage.zz) this.d.get(context);
        if (zzVar != null && (weakReference = (java.lang.ref.WeakReference) zzVar.d(j)) != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zzVar.h(j);
        }
        return null;
    }

    private final synchronized void j(android.content.Context context, long j, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            java.util.WeakHashMap weakHashMap = this.d;
            defpackage.zz zzVar = (defpackage.zz) weakHashMap.get(context);
            if (zzVar == null) {
                zzVar = new defpackage.zz(10);
                weakHashMap.put(context, zzVar);
            }
            zzVar.g(j, new java.lang.ref.WeakReference(constantState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    final synchronized android.content.res.ColorStateList a(android.content.Context context, int i) {
        defpackage.abb abbVar;
        java.util.WeakHashMap weakHashMap = this.c;
        android.content.res.ColorStateList colorStateListD = (weakHashMap == null || (abbVar = (defpackage.abb) weakHashMap.get(context)) == null) ? null : (android.content.res.ColorStateList) defpackage.abc.a(abbVar, i);
        if (colorStateListD == null) {
            defpackage.jc jcVar = this.g;
            if (jcVar == null) {
                colorStateListD = null;
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_edit_text_material) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_edittext);
            } else if (i == 2131230948) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_switch_track);
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                android.content.res.ColorStateList colorStateListC = defpackage.ne.c(context, com.google.android.projection.gearhead.R.attr.colorSwitchThumbNormal);
                if (colorStateListC == null || !colorStateListC.isStateful()) {
                    iArr[0] = defpackage.ne.a;
                    iArr2[0] = defpackage.ne.a(context, com.google.android.projection.gearhead.R.attr.colorSwitchThumbNormal);
                    iArr[1] = defpackage.ne.d;
                    iArr2[1] = defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlActivated);
                    iArr[2] = defpackage.ne.e;
                    iArr2[2] = defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = defpackage.ne.a;
                    iArr[0] = iArr3;
                    iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                    iArr[1] = defpackage.ne.d;
                    iArr2[1] = defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlActivated);
                    iArr[2] = defpackage.ne.e;
                    iArr2[2] = colorStateListC.getDefaultColor();
                }
                colorStateListD = new android.content.res.ColorStateList(iArr, iArr2);
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_btn_default_mtrl_shape) {
                colorStateListD = defpackage.jc.b(context, defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorButtonNormal));
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_btn_borderless_material) {
                colorStateListD = defpackage.jc.b(context, 0);
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_btn_colored_material) {
                colorStateListD = defpackage.jc.b(context, defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorAccent));
            } else if (i == 2131230943 || i == com.google.android.projection.gearhead.R.drawable.abc_spinner_textfield_background_material) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_spinner);
            } else if (defpackage.jc.a(jcVar.b, i)) {
                colorStateListD = defpackage.ne.c(context, com.google.android.projection.gearhead.R.attr.colorControlNormal);
            } else if (defpackage.jc.a(jcVar.e, i)) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_default);
            } else if (defpackage.jc.a(jcVar.f, i)) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_btn_checkable);
            } else if (i == com.google.android.projection.gearhead.R.drawable.abc_seekbar_thumb_material) {
                colorStateListD = defpackage.duw.d(context, com.google.android.projection.gearhead.R.color.abc_tint_seek_thumb);
                i = com.google.android.projection.gearhead.R.drawable.abc_seekbar_thumb_material;
            } else {
                colorStateListD = null;
            }
            if (colorStateListD != null) {
                java.util.WeakHashMap weakHashMap2 = this.c;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new java.util.WeakHashMap();
                    this.c = weakHashMap2;
                }
                defpackage.abb abbVar2 = (defpackage.abb) weakHashMap2.get(context);
                if (abbVar2 == null) {
                    abbVar2 = new defpackage.abb(null);
                    this.c.put(context, abbVar2);
                }
                int i2 = abbVar2.d;
                if (i2 == 0 || i > abbVar2.b[i2 - 1]) {
                    if (abbVar2.a && i2 >= abbVar2.b.length) {
                        defpackage.abc.b(abbVar2);
                    }
                    int i3 = abbVar2.d;
                    int[] iArr4 = abbVar2.b;
                    if (i3 >= iArr4.length) {
                        int iC = defpackage.abg.c((i3 + 1) * 4) / 4;
                        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr4, iC);
                        iArrCopyOf.getClass();
                        abbVar2.b = iArrCopyOf;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(abbVar2.c, iC);
                        objArrCopyOf.getClass();
                        abbVar2.c = objArrCopyOf;
                    }
                    abbVar2.b[i3] = i;
                    abbVar2.c[i3] = colorStateListD;
                    abbVar2.d = i3 + 1;
                } else {
                    abbVar2.f(i, colorStateListD);
                }
                return colorStateListD;
            }
        }
        return colorStateListD;
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159 A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0164 A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018e A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x0198, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0140, B:76:0x017d, B:78:0x018e, B:62:0x014f, B:65:0x0159, B:67:0x0164, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x019d, B:87:0x01a6), top: B:91:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context context, int i, boolean z) {
        android.graphics.drawable.Drawable drawable;
        int[] iArr;
        android.graphics.PorterDuff.Mode mode;
        boolean zA;
        int i2;
        int i3;
        android.graphics.drawable.Drawable drawableMutate;
        int i4 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f) {
                this.f = true;
                android.graphics.drawable.Drawable drawableC = c(context, com.google.android.projection.gearhead.R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof defpackage.fia) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            android.util.TypedValue typedValue = this.e;
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
                this.e = typedValue;
            }
            context.getResources().getValue(i4, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            android.graphics.drawable.Drawable drawableI = i(context, j);
            drawable = null;
            mode = null;
            android.graphics.PorterDuff.Mode mode2 = null;
            if (drawableI == null) {
                if (this.g == null) {
                    drawableI = null;
                } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_cab_background_top_material) {
                    drawableI = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{c(context, com.google.android.projection.gearhead.R.drawable.abc_cab_background_internal_bg), c(context, 2131230899)});
                } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_material) {
                    drawableI = defpackage.jc.c(this, context, com.google.android.projection.gearhead.R.dimen.abc_star_big);
                } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_indicator_material) {
                    drawableI = defpackage.jc.c(this, context, com.google.android.projection.gearhead.R.dimen.abc_star_medium);
                } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_small_material) {
                    drawableI = defpackage.jc.c(this, context, com.google.android.projection.gearhead.R.dimen.abc_star_small);
                    i4 = com.google.android.projection.gearhead.R.drawable.abc_ratingbar_small_material;
                } else {
                    drawableI = null;
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    j(context, j, drawableI);
                }
            }
            if (drawableI == null) {
                drawableI = context.getDrawable(i4);
            }
            if (drawableI == null) {
                drawable = drawableI;
            } else {
                android.content.res.ColorStateList colorStateListA = a(context, i4);
                if (colorStateListA != null) {
                    android.graphics.drawable.Drawable drawableMutate2 = drawableI.mutate();
                    drawableMutate2.setTintList(colorStateListA);
                    if (this.g != null && i4 == com.google.android.projection.gearhead.R.drawable.abc_switch_thumb_material) {
                        mode2 = android.graphics.PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode2 != null) {
                        drawableMutate2.setTintMode(mode2);
                    }
                    drawable = drawableMutate2;
                } else {
                    defpackage.jc jcVar = this.g;
                    if (jcVar != null) {
                        if (i4 == com.google.android.projection.gearhead.R.drawable.abc_seekbar_track_material) {
                            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawableI;
                            android.graphics.drawable.Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int iB = defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlNormal);
                            android.graphics.PorterDuff.Mode mode3 = defpackage.jd.a;
                            defpackage.jc.d(drawableFindDrawableByLayerId, iB, mode3);
                            defpackage.jc.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlNormal), mode3);
                            defpackage.jc.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlActivated), mode3);
                        } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_material || i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_indicator_material || i4 == com.google.android.projection.gearhead.R.drawable.abc_ratingbar_small_material) {
                            android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawableI;
                            android.graphics.drawable.Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                            int iA = defpackage.ne.a(context, com.google.android.projection.gearhead.R.attr.colorControlNormal);
                            android.graphics.PorterDuff.Mode mode4 = defpackage.jd.a;
                            defpackage.jc.d(drawableFindDrawableByLayerId2, iA, mode4);
                            defpackage.jc.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlActivated), mode4);
                            defpackage.jc.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), defpackage.ne.b(context, com.google.android.projection.gearhead.R.attr.colorControlActivated), mode4);
                        } else if (jcVar != null) {
                            iArr = jcVar.a;
                            mode = defpackage.jd.a;
                            if (defpackage.jc.a(iArr, i4)) {
                                i2 = com.google.android.projection.gearhead.R.attr.colorControlNormal;
                            } else if (defpackage.jc.a(jcVar.c, i4)) {
                                i2 = com.google.android.projection.gearhead.R.attr.colorControlActivated;
                            } else {
                                zA = defpackage.jc.a(jcVar.d, i4);
                                i2 = android.R.attr.colorBackground;
                                if (zA) {
                                    mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                                } else {
                                    if (i4 == 2131230919) {
                                        i3 = 41;
                                        i2 = 16842800;
                                        z2 = true;
                                    } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_dialog_material_background) {
                                        i2 = 0;
                                        i3 = -1;
                                    }
                                    if (z2) {
                                        drawableMutate = drawableI.mutate();
                                        drawableMutate.setColorFilter(defpackage.jd.b(defpackage.ne.b(context, i2), mode));
                                        if (i3 != -1) {
                                            drawableMutate.setAlpha(i3);
                                        }
                                    } else if (!z) {
                                    }
                                }
                            }
                            i3 = -1;
                            z2 = true;
                            if (z2) {
                                drawableMutate = drawableI.mutate();
                                drawableMutate.setColorFilter(defpackage.jd.b(defpackage.ne.b(context, i2), mode));
                                if (i3 != -1) {
                                    drawableMutate.setAlpha(i3);
                                }
                            } else if (!z) {
                            }
                        } else if (!z) {
                        }
                        drawable = drawableI;
                    } else if (jcVar != null) {
                        iArr = jcVar.a;
                        mode = defpackage.jd.a;
                        if (defpackage.jc.a(iArr, i4)) {
                            i2 = com.google.android.projection.gearhead.R.attr.colorControlNormal;
                        } else if (defpackage.jc.a(jcVar.c, i4)) {
                            i2 = com.google.android.projection.gearhead.R.attr.colorControlActivated;
                        } else {
                            zA = defpackage.jc.a(jcVar.d, i4);
                            i2 = android.R.attr.colorBackground;
                            if (zA) {
                                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                            } else {
                                if (i4 == 2131230919) {
                                    i3 = 41;
                                    i2 = 16842800;
                                    z2 = true;
                                } else if (i4 == com.google.android.projection.gearhead.R.drawable.abc_dialog_material_background) {
                                    i2 = 0;
                                    i3 = -1;
                                }
                                if (z2) {
                                    drawableMutate = drawableI.mutate();
                                    drawableMutate.setColorFilter(defpackage.jd.b(defpackage.ne.b(context, i2), mode));
                                    if (i3 != -1) {
                                        drawableMutate.setAlpha(i3);
                                    }
                                } else if (!z) {
                                }
                                drawable = drawableI;
                            }
                        }
                        i3 = -1;
                        z2 = true;
                        if (z2) {
                            drawableMutate = drawableI.mutate();
                            drawableMutate.setColorFilter(defpackage.jd.b(defpackage.ne.b(context, i2), mode));
                            if (i3 != -1) {
                                drawableMutate.setAlpha(i3);
                            }
                        } else if (!z) {
                        }
                        drawable = drawableI;
                    } else if (!z) {
                        drawable = drawableI;
                    }
                }
            }
            if (drawable != null) {
                defpackage.kp.b(drawable);
            }
        }
        return drawable;
    }

    public final synchronized void f(android.content.Context context) {
        defpackage.zz zzVar = (defpackage.zz) this.d.get(context);
        if (zzVar != null) {
            zzVar.f();
        }
    }

    public final synchronized void h(defpackage.jc jcVar) {
        this.g = jcVar;
    }
}
