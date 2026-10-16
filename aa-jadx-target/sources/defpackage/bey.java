package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class bey extends defpackage.affy implements defpackage.affc {
    public bey(java.lang.Object obj) {
        super(1, obj, defpackage.bew.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    /* JADX WARN: Code duplicated, block: B:198:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:217:0x032d  */
    /* JADX WARN: Code duplicated, block: B:374:0x05a0 A[PHI: r2
  0x05a0: PHI (r2v19 bec) = (r2v18 bec), (r2v30 bec), (r2v63 bec) binds: [B:68:0x0130, B:107:0x019a, B:199:0x02f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:388:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        defpackage.djb djbVar;
        defpackage.bec becVar;
        final defpackage.bec becVar2;
        java.lang.Integer numValueOf;
        android.view.KeyEvent keyEvent = ((cpx) obj).a;
        final defpackage.bew bewVar = (defpackage.bew) this.receiver;
        boolean z = true;
        if (keyEvent.getAction() != 0 || java.lang.Character.isISOControl(keyEvent.getUnicodeChar())) {
            djbVar = null;
        } else {
            defpackage.nub nubVar = bewVar.k;
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                nubVar.a = java.lang.Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                java.lang.Object obj2 = nubVar.a;
                if (obj2 != null) {
                    nubVar.a = null;
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(android.view.KeyCharacterMap.getDeadChar(((java.lang.Integer) obj2).intValue(), unicodeChar));
                    if (numValueOf2.intValue() == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        unicodeChar = numValueOf2.intValue();
                    }
                    numValueOf = java.lang.Integer.valueOf(unicodeChar);
                } else {
                    numValueOf = java.lang.Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                djbVar = new defpackage.djb(new java.lang.StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            } else {
                djbVar = null;
            }
        }
        if (djbVar != null) {
            boolean z2 = bewVar.d;
            bewVar.a(djbVar);
            bewVar.j.f();
        } else if (defpackage.tn.h(keyEvent) == 2) {
            defpackage.asq asqVar = bewVar.l;
            int i = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
            if (i == 9) {
                long jI = defpackage.tn.i(keyEvent);
                if (jI == defpackage.tn.e(21)) {
                    becVar = defpackage.bec.SELECT_LINE_LEFT;
                } else if (jI == defpackage.tn.e(22)) {
                    becVar = defpackage.bec.SELECT_LINE_RIGHT;
                } else if (jI == defpackage.tn.e(19)) {
                    becVar = defpackage.bec.SELECT_HOME;
                } else if (jI == defpackage.tn.e(20)) {
                    becVar = defpackage.bec.SELECT_END;
                } else {
                    becVar = null;
                }
            } else if (i == 1) {
                long jI2 = defpackage.tn.i(keyEvent);
                if (jI2 == defpackage.tn.e(21)) {
                    becVar = defpackage.bec.LINE_LEFT;
                } else if (jI2 == defpackage.tn.e(22)) {
                    becVar = defpackage.bec.LINE_RIGHT;
                } else if (jI2 == defpackage.tn.e(19)) {
                    becVar = defpackage.bec.HOME;
                } else if (jI2 == defpackage.tn.e(20)) {
                    becVar = defpackage.bec.END;
                } else if (jI2 == defpackage.tn.e(67)) {
                    becVar = defpackage.bec.DELETE_FROM_LINE_START;
                } else {
                    becVar = null;
                }
            } else {
                becVar = null;
            }
            if (becVar == null) {
                int i2 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2);
                int i3 = true != keyEvent.isMetaPressed() ? 0 : 4;
                int i4 = true != keyEvent.isShiftPressed() ? 0 : 8;
                long jI3 = defpackage.tn.i(keyEvent);
                int i5 = i2 | i3 | i4;
                if (jI3 == defpackage.tn.e(67)) {
                    if (i5 == 0 || i5 == 8 || i5 == 12) {
                        becVar = defpackage.bec.DELETE_PREV_CHAR;
                    } else if (i5 == 2 || i5 == 10) {
                        becVar = defpackage.bec.DELETE_PREV_WORD;
                    } else {
                        becVar = null;
                    }
                } else if ((jI3 == defpackage.tn.e(66) || jI3 == defpackage.tn.e(160)) && (i5 == 0 || i5 == 8 || i5 == 2 || i5 == 10)) {
                    becVar = defpackage.bec.NEW_LINE;
                } else {
                    becVar = null;
                }
                if (becVar == null) {
                    int i6 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
                    if (i6 == 10) {
                        long jI4 = defpackage.tn.i(keyEvent);
                        if (jI4 == defpackage.tn.e(21) || jI4 == defpackage.tn.e(-1000000003)) {
                            becVar = defpackage.bec.SELECT_LEFT_WORD;
                        } else if (jI4 == defpackage.tn.e(22) || jI4 == defpackage.tn.e(-1000000004)) {
                            becVar = defpackage.bec.SELECT_RIGHT_WORD;
                        } else if (jI4 == defpackage.tn.e(19) || jI4 == defpackage.tn.e(-1000000001)) {
                            becVar = defpackage.bec.SELECT_PREV_PARAGRAPH;
                        } else if (jI4 == defpackage.tn.e(20) || jI4 == defpackage.tn.e(-1000000002)) {
                            becVar = defpackage.bec.SELECT_NEXT_PARAGRAPH;
                        } else {
                            becVar = null;
                        }
                    } else if (i6 == 2) {
                        long jI5 = defpackage.tn.i(keyEvent);
                        if (jI5 == defpackage.tn.e(21) || jI5 == defpackage.tn.e(-1000000003)) {
                            becVar = defpackage.bec.LEFT_WORD;
                        } else if (jI5 == defpackage.tn.e(22) || jI5 == defpackage.tn.e(-1000000004)) {
                            becVar = defpackage.bec.RIGHT_WORD;
                        } else if (jI5 == defpackage.tn.e(19) || jI5 == defpackage.tn.e(-1000000001)) {
                            becVar = defpackage.bec.PREV_PARAGRAPH;
                        } else if (jI5 == defpackage.tn.e(20) || jI5 == defpackage.tn.e(-1000000002)) {
                            becVar = defpackage.bec.NEXT_PARAGRAPH;
                        } else if (jI5 == defpackage.tn.e(36)) {
                            becVar = defpackage.bec.DELETE_PREV_CHAR;
                        } else if (jI5 == defpackage.tn.e(112)) {
                            becVar = defpackage.bec.DELETE_NEXT_WORD;
                        } else if (jI5 == defpackage.tn.e(73)) {
                            becVar = defpackage.bec.DESELECT;
                        } else {
                            becVar = null;
                        }
                    } else if (i6 == 8) {
                        long jI6 = defpackage.tn.i(keyEvent);
                        if (jI6 == defpackage.tn.e(122) || jI6 == defpackage.tn.e(-1000000005)) {
                            becVar = defpackage.bec.SELECT_LINE_START;
                        } else if (jI6 == defpackage.tn.e(123) || jI6 == defpackage.tn.e(-1000000006)) {
                            becVar = defpackage.bec.SELECT_LINE_END;
                        } else {
                            becVar = null;
                        }
                    } else if (i6 == 1 && defpackage.tn.i(keyEvent) == defpackage.tn.e(112)) {
                        becVar = defpackage.bec.DELETE_TO_LINE_END;
                    } else {
                        becVar = null;
                    }
                    if (becVar == null) {
                        int i7 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
                        if (i7 == 10) {
                            if (defpackage.tn.i(keyEvent) == defpackage.tn.e(54)) {
                                becVar2 = defpackage.bec.REDO;
                            } else {
                                becVar2 = null;
                            }
                        } else if (i7 == 2) {
                            long jI7 = defpackage.tn.i(keyEvent);
                            if (jI7 == defpackage.tn.e(31) || jI7 == defpackage.tn.e(124) || jI7 == defpackage.tn.e(-1000000009)) {
                                becVar2 = defpackage.bec.COPY;
                            } else if (jI7 == defpackage.tn.e(50)) {
                                becVar2 = defpackage.bec.PASTE;
                            } else if (jI7 == defpackage.tn.e(52)) {
                                becVar2 = defpackage.bec.CUT;
                            } else if (jI7 == defpackage.tn.e(29)) {
                                becVar2 = defpackage.bec.SELECT_ALL;
                            } else if (jI7 == defpackage.tn.e(53)) {
                                becVar2 = defpackage.bec.REDO;
                            } else if (jI7 == defpackage.tn.e(54)) {
                                becVar2 = defpackage.bec.UNDO;
                            } else {
                                becVar2 = null;
                            }
                        } else if (i7 == 8) {
                            long jI8 = defpackage.tn.i(keyEvent);
                            if (jI8 == defpackage.tn.e(21) || jI8 == defpackage.tn.e(-1000000003)) {
                                becVar2 = defpackage.bec.SELECT_LEFT_CHAR;
                            } else if (jI8 == defpackage.tn.e(22) || jI8 == defpackage.tn.e(-1000000004)) {
                                becVar2 = defpackage.bec.SELECT_RIGHT_CHAR;
                            } else if (jI8 == defpackage.tn.e(19) || jI8 == defpackage.tn.e(-1000000001)) {
                                becVar2 = defpackage.bec.SELECT_UP;
                            } else if (jI8 == defpackage.tn.e(20) || jI8 == defpackage.tn.e(-1000000002)) {
                                becVar2 = defpackage.bec.SELECT_DOWN;
                            } else if (jI8 == defpackage.tn.e(92) || jI8 == defpackage.tn.e(-1000000007)) {
                                becVar2 = defpackage.bec.SELECT_PAGE_UP;
                            } else if (jI8 == defpackage.tn.e(93) || jI8 == defpackage.tn.e(-1000000008)) {
                                becVar2 = defpackage.bec.SELECT_PAGE_DOWN;
                            } else if (jI8 == defpackage.tn.e(122) || jI8 == defpackage.tn.e(-1000000005)) {
                                becVar2 = defpackage.bec.SELECT_LINE_START;
                            } else if (jI8 == defpackage.tn.e(123) || jI8 == defpackage.tn.e(-1000000006)) {
                                becVar2 = defpackage.bec.SELECT_LINE_END;
                            } else if (jI8 == defpackage.tn.e(124) || jI8 == defpackage.tn.e(-1000000009)) {
                                becVar2 = defpackage.bec.PASTE;
                            } else {
                                becVar2 = null;
                            }
                        } else if (i7 == 0) {
                            long jI9 = defpackage.tn.i(keyEvent);
                            if (jI9 == defpackage.tn.e(21) || jI9 == defpackage.tn.e(-1000000003)) {
                                becVar2 = defpackage.bec.LEFT_CHAR;
                            } else if (jI9 == defpackage.tn.e(22) || jI9 == defpackage.tn.e(-1000000004)) {
                                becVar2 = defpackage.bec.RIGHT_CHAR;
                            } else if (jI9 == defpackage.tn.e(19) || jI9 == defpackage.tn.e(-1000000001)) {
                                becVar2 = defpackage.bec.UP;
                            } else if (jI9 == defpackage.tn.e(20) || jI9 == defpackage.tn.e(-1000000002)) {
                                becVar2 = defpackage.bec.DOWN;
                            } else if (jI9 == defpackage.tn.e(23)) {
                                becVar2 = defpackage.bec.CENTER;
                            } else if (jI9 == defpackage.tn.e(92) || jI9 == defpackage.tn.e(-1000000007)) {
                                becVar2 = defpackage.bec.PAGE_UP;
                            } else if (jI9 == defpackage.tn.e(93) || jI9 == defpackage.tn.e(-1000000008)) {
                                becVar2 = defpackage.bec.PAGE_DOWN;
                            } else if (jI9 == defpackage.tn.e(122) || jI9 == defpackage.tn.e(-1000000005)) {
                                becVar2 = defpackage.bec.LINE_START;
                            } else if (jI9 == defpackage.tn.e(123) || jI9 == defpackage.tn.e(-1000000006)) {
                                becVar2 = defpackage.bec.LINE_END;
                            } else if (jI9 == defpackage.tn.e(66) || jI9 == defpackage.tn.e(160)) {
                                becVar2 = defpackage.bec.NEW_LINE;
                            } else if (jI9 == defpackage.tn.e(67)) {
                                becVar2 = defpackage.bec.DELETE_PREV_CHAR;
                            } else if (jI9 == defpackage.tn.e(112)) {
                                becVar2 = defpackage.bec.DELETE_NEXT_CHAR;
                            } else if (jI9 == defpackage.tn.e(279)) {
                                becVar2 = defpackage.bec.PASTE;
                            } else if (jI9 == defpackage.tn.e(277)) {
                                becVar2 = defpackage.bec.CUT;
                            } else if (jI9 == defpackage.tn.e(278)) {
                                becVar2 = defpackage.bec.COPY;
                            } else if (jI9 == defpackage.tn.e(61)) {
                                becVar2 = defpackage.bec.TAB;
                            } else {
                                becVar2 = null;
                            }
                        } else {
                            becVar2 = null;
                        }
                    } else {
                        becVar2 = becVar;
                    }
                } else {
                    becVar2 = becVar;
                }
            } else {
                becVar2 = becVar;
            }
            if (becVar2 != null) {
                if (becVar2.X) {
                    boolean z3 = bewVar.d;
                }
                final defpackage.afgq afgqVar = new defpackage.afgq();
                afgqVar.a = true;
                defpackage.affc affcVar = new defpackage.affc() { // from class: beu
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        java.lang.Object obj4;
                        defpackage.afgq afgqVar2 = afgqVar;
                        defpackage.bjw bjwVar = (defpackage.bjw) obj3;
                        defpackage.bew bewVar2 = bewVar;
                        java.lang.Object obj5 = null;
                        switch (becVar2.ordinal()) {
                            case defpackage.abnt.b /* 0 */:
                                defpackage.awl awlVar = new defpackage.awl(19);
                                bjwVar.d.f();
                                if (bjwVar.f().length() > 0) {
                                    if (defpackage.dgc.i(bjwVar.b)) {
                                        awlVar.invoke(bjwVar);
                                    } else if (!bjwVar.h()) {
                                        long j = bjwVar.b;
                                        int iMax = java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L));
                                        bjwVar.g(iMax, iMax);
                                    } else {
                                        long j2 = bjwVar.b;
                                        int iMin = java.lang.Math.min((int) (j2 >> 32), (int) (j2 & 4294967295L));
                                        bjwVar.g(iMin, iMin);
                                    }
                                }
                                break;
                            case 1:
                                defpackage.awl awlVar2 = new defpackage.awl(20);
                                bjwVar.d.f();
                                if (bjwVar.f().length() > 0) {
                                    if (defpackage.dgc.i(bjwVar.b)) {
                                        awlVar2.invoke(bjwVar);
                                    } else if (!bjwVar.h()) {
                                        long j3 = bjwVar.b;
                                        int iMin2 = java.lang.Math.min((int) (j3 >> 32), (int) (j3 & 4294967295L));
                                        bjwVar.g(iMin2, iMin2);
                                    } else {
                                        long j4 = bjwVar.b;
                                        int iMax2 = java.lang.Math.max((int) (j4 >> 32), (int) (j4 & 4294967295L));
                                        bjwVar.g(iMax2, iMax2);
                                    }
                                }
                                break;
                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                bjwVar.s();
                                break;
                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                bjwVar.o();
                                break;
                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                bjwVar.p();
                                break;
                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                bjwVar.q();
                                break;
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                bjwVar.y();
                                break;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                bjwVar.v();
                                break;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                bjwVar.w();
                                break;
                            case 9:
                                bjwVar.x();
                                break;
                            case 10:
                                bjwVar.z();
                                break;
                            case 11:
                                bjwVar.l();
                                break;
                            case 12:
                            case 48:
                                break;
                            case 13:
                                bjwVar.A();
                                break;
                            case 14:
                                bjwVar.m();
                                break;
                            case 15:
                                bjwVar.u();
                                break;
                            case 16:
                                bjwVar.t();
                                break;
                            case 17:
                                bewVar2.b.y(false);
                                break;
                            case 18:
                                bewVar2.b.A();
                                break;
                            case 19:
                                bewVar2.b.z();
                                break;
                            case 20:
                                java.util.List listK = bjwVar.k(new defpackage.bev(1));
                                if (listK != null) {
                                    bewVar2.b(listK);
                                }
                                break;
                            case 21:
                                java.util.List listK2 = bjwVar.k(new defpackage.bev(0));
                                if (listK2 != null) {
                                    bewVar2.b(listK2);
                                }
                                break;
                            case 22:
                                java.util.List listK3 = bjwVar.k(new defpackage.bev(2));
                                if (listK3 != null) {
                                    bewVar2.b(listK3);
                                }
                                break;
                            case 23:
                                java.util.List listK4 = bjwVar.k(new defpackage.bev(3));
                                if (listK4 != null) {
                                    bewVar2.b(listK4);
                                }
                                break;
                            case 24:
                                java.util.List listK5 = bjwVar.k(new defpackage.bev(4));
                                if (listK5 != null) {
                                    bewVar2.b(listK5);
                                }
                                break;
                            case 25:
                                java.util.List listK6 = bjwVar.k(new defpackage.bev(5));
                                if (listK6 != null) {
                                    bewVar2.b(listK6);
                                }
                                break;
                            case 26:
                                bjwVar.d.f();
                                if (bjwVar.f().length() > 0) {
                                    bjwVar.g(0, bjwVar.f().length());
                                }
                                break;
                            case 27:
                                bjwVar.n();
                                bjwVar.i();
                                break;
                            case 28:
                                bjwVar.r();
                                bjwVar.i();
                                break;
                            case 29:
                                bjwVar.z();
                                bjwVar.i();
                                break;
                            case 30:
                                bjwVar.l();
                                bjwVar.i();
                                break;
                            case 31:
                                bjwVar.A();
                                bjwVar.i();
                                break;
                            case 32:
                                bjwVar.m();
                                bjwVar.i();
                                break;
                            case 33:
                                bjwVar.u();
                                bjwVar.i();
                                break;
                            case 34:
                                bjwVar.t();
                                bjwVar.i();
                                break;
                            case 35:
                                bjwVar.o();
                                bjwVar.i();
                                break;
                            case 36:
                                bjwVar.s();
                                bjwVar.i();
                                break;
                            case 37:
                                bjwVar.p();
                                bjwVar.i();
                                break;
                            case 38:
                                bjwVar.q();
                                bjwVar.i();
                                break;
                            case 39:
                                bjwVar.y();
                                bjwVar.i();
                                break;
                            case 40:
                                bjwVar.v();
                                bjwVar.i();
                                break;
                            case 41:
                                bjwVar.w();
                                bjwVar.i();
                                break;
                            case 42:
                                bjwVar.x();
                                bjwVar.i();
                                break;
                            case 43:
                                bjwVar.d.f();
                                if (bjwVar.f().length() > 0) {
                                    long j5 = bjwVar.b;
                                    long j6 = defpackage.dgc.a;
                                    int i8 = (int) (j5 & 4294967295L);
                                    bjwVar.g(i8, i8);
                                }
                                break;
                            case 44:
                                if (!bewVar2.e) {
                                    bewVar2.a(new defpackage.djb("\n", 1));
                                } else {
                                    afgqVar2.a = ((java.lang.Boolean) bewVar2.a.o.invoke(new defpackage.djk(bewVar2.i))).booleanValue();
                                }
                                break;
                            case 45:
                                if (!bewVar2.e) {
                                    bewVar2.a(new defpackage.djb("\t", 1));
                                } else {
                                    afgqVar2.a = false;
                                }
                                break;
                            case 46:
                                defpackage.bfo bfoVar = bewVar2.g;
                                if (bfoVar != null) {
                                    bfoVar.b(bjwVar.j());
                                }
                                if (bfoVar != null) {
                                    defpackage.cok cokVar = bfoVar.d;
                                    if (cokVar != null && (obj4 = cokVar.b) != null) {
                                        defpackage.cok cokVar2 = (defpackage.cok) obj4;
                                        bfoVar.d = cokVar2;
                                        bfoVar.a -= ((defpackage.dkd) cokVar.a).a().length();
                                        bfoVar.e = new defpackage.cok(bfoVar.e, (defpackage.dkd) cokVar.a);
                                        obj5 = cokVar2.a;
                                    }
                                    if (obj5 != null) {
                                        bewVar2.h.invoke(obj5);
                                    }
                                }
                                break;
                            case 47:
                                defpackage.bfo bfoVar2 = bewVar2.g;
                                if (bfoVar2 != null) {
                                    defpackage.cok cokVar3 = bfoVar2.e;
                                    if (cokVar3 != null) {
                                        bfoVar2.e = (defpackage.cok) cokVar3.b;
                                        defpackage.dkd dkdVar = (defpackage.dkd) cokVar3.a;
                                        bfoVar2.d = new defpackage.cok(bfoVar2.d, dkdVar);
                                        bfoVar2.a += dkdVar.a().length();
                                        obj5 = cokVar3.a;
                                    }
                                    if (obj5 != null) {
                                        bewVar2.h.invoke(obj5);
                                    }
                                }
                                break;
                            default:
                                throw new defpackage.afas();
                        }
                        return defpackage.afbk.a;
                    }
                };
                defpackage.dkd dkdVar = bewVar.c;
                defpackage.bjw bjwVar = new defpackage.bjw(dkdVar, bewVar.f, bewVar.a.e(), bewVar.j);
                affcVar.invoke(bjwVar);
                long j = bjwVar.b;
                long j2 = dkdVar.b;
                long j3 = defpackage.dgc.a;
                if (j != j2 || !defpackage.afga.f(bjwVar.c, dkdVar.a)) {
                    bewVar.h.invoke(bjwVar.j());
                }
                defpackage.bfo bfoVar = bewVar.g;
                if (bfoVar != null) {
                    bfoVar.a();
                }
                z = afgqVar.a;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
