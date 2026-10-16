package defpackage;

import android.view.inputmethod.InputConnection;

/* loaded from: classes3.dex */
public final class xdh extends xcs {
    private static final yph o = yph.c("GH.LatinRotaryKeyboard");

    @Override // defpackage.xcs
    protected final xdy c() {
        return d(this.b, "rotary_keyboard_layout", this.g, this.f);
    }

    @Override // defpackage.xcs
    public final void f(int i, boolean z) {
        InputConnection inputConnection = this.c;
        if (inputConnection.getTextBeforeCursor(1, 0) != null) {
            String string = inputConnection.getTextBeforeCursor(1, 0).toString();
            String strValueOf = String.valueOf((char) i);
            int iHashCode = string.hashCode();
            String str = null;
            if (iHashCode != 96) {
                if (iHashCode != 168) {
                    if (iHashCode != 180) {
                        if (iHashCode == 710 && string.equals("ˆ")) {
                            int iHashCode2 = strValueOf.hashCode();
                            if (iHashCode2 != 97) {
                                if (iHashCode2 != 101) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 111) {
                                            if (iHashCode2 == 117 && strValueOf.equals("u")) {
                                                str = "û";
                                            }
                                        } else if (strValueOf.equals("o")) {
                                            str = "ô";
                                        }
                                    } else if (strValueOf.equals("i")) {
                                        str = "î";
                                    }
                                } else if (strValueOf.equals("e")) {
                                    str = "ê";
                                }
                            } else if (strValueOf.equals("a")) {
                                str = "â";
                            }
                        }
                    } else if (string.equals("´")) {
                        int iHashCode3 = strValueOf.hashCode();
                        if (iHashCode3 != 97) {
                            if (iHashCode3 != 101) {
                                if (iHashCode3 != 105) {
                                    if (iHashCode3 != 111) {
                                        if (iHashCode3 == 117 && strValueOf.equals("u")) {
                                            str = "ú";
                                        }
                                    } else if (strValueOf.equals("o")) {
                                        str = "ó";
                                    }
                                } else if (strValueOf.equals("i")) {
                                    str = "í";
                                }
                            } else if (strValueOf.equals("e")) {
                                str = "é";
                            }
                        } else if (strValueOf.equals("a")) {
                            str = "á";
                        }
                    }
                } else if (string.equals("¨")) {
                    int iHashCode4 = strValueOf.hashCode();
                    if (iHashCode4 != 97) {
                        if (iHashCode4 != 101) {
                            if (iHashCode4 != 105) {
                                if (iHashCode4 != 111) {
                                    if (iHashCode4 == 117 && strValueOf.equals("u")) {
                                        str = "ü";
                                    }
                                } else if (strValueOf.equals("o")) {
                                    str = "ö";
                                }
                            } else if (strValueOf.equals("i")) {
                                str = "ï";
                            }
                        } else if (strValueOf.equals("e")) {
                            str = "ë";
                        }
                    } else if (strValueOf.equals("a")) {
                        str = "ä";
                    }
                }
            } else if (string.equals("`")) {
                int iHashCode5 = strValueOf.hashCode();
                if (iHashCode5 != 97) {
                    if (iHashCode5 != 101) {
                        if (iHashCode5 != 105) {
                            if (iHashCode5 != 111) {
                                if (iHashCode5 == 117 && strValueOf.equals("u")) {
                                    str = "ù";
                                }
                            } else if (strValueOf.equals("o")) {
                                str = "ò";
                            }
                        } else if (strValueOf.equals("i")) {
                            str = "ì";
                        }
                    } else if (strValueOf.equals("e")) {
                        str = "è";
                    }
                } else if (strValueOf.equals("a")) {
                    str = "à";
                }
            }
            String str2 = str;
            if (str2 != null) {
                if (z) {
                    this.d.f();
                }
                inputConnection.deleteSurroundingText(1, 0);
                inputConnection.commitText(str2, 1);
                this.d.d();
                ((ype) o.l().ai((char) 10134)).y("Committing text: %s", str2);
                return;
            }
        }
        super.f(i, z);
    }
}
