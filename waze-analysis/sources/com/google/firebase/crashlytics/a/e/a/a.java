package com.google.firebase.crashlytics.a.e.a;

import android.util.Base64;
import android.util.JsonReader;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.a.e.bb;
import com.google.firebase.crashlytics.a.e.bq;
import com.google.firebase.crashlytics.a.e.by;
import com.google.firebase.crashlytics.a.e.cj;
import com.google.firebase.crashlytics.a.e.ck;
import com.waze.strings.DisplayStrings;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9287a;

    public /* synthetic */ a(int i2) {
        this.f9287a = i2;
    }

    @Override // com.google.firebase.crashlytics.a.e.a.b
    public final Object a(JsonReader jsonReader) throws IOException {
        switch (this.f9287a) {
            case 0:
                int i2 = c.f9288a;
                bb bbVar = new bb();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -609862170) {
                        if (iHashCode != 3002454) {
                            if (iHashCode == 230943785 && strNextName.equals("buildId")) {
                                bbVar.c(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("arch")) {
                            bbVar.b(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("libraryName")) {
                        bbVar.d(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return bbVar.a();
            case 1:
                int i3 = c.f9288a;
                by byVar = new by();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    switch (strNextName2.hashCode()) {
                        case -1019779949:
                            if (!strNextName2.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                byVar.d(jsonReader.nextLong());
                                break;
                            }
                        case -887523944:
                            if (!strNextName2.equals("symbol")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                byVar.f(jsonReader.nextString());
                                break;
                            }
                        case DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_REPORT_BUTTON_FTE_HINT_C /* 3571 */:
                            if (!strNextName2.equals("pc")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                byVar.e(jsonReader.nextLong());
                                break;
                            }
                        case 3143036:
                            if (!strNextName2.equals("file")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                byVar.b(jsonReader.nextString());
                                break;
                            }
                        case 2125650548:
                            if (!strNextName2.equals("importance")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                byVar.c(jsonReader.nextInt());
                                break;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return byVar.a();
            case 2:
                int i4 = c.f9288a;
                ck ckVar = new ck();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    int iHashCode2 = strNextName3.hashCode();
                    if (iHashCode2 != 106079) {
                        if (iHashCode2 == 111972721 && strNextName3.equals("value")) {
                            ckVar.l(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName3.equals("key")) {
                        ckVar.k(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return ckVar.j();
            case 3:
                return c.j(jsonReader);
            case 4:
                return c.k(jsonReader);
            case 5:
                return c.a(jsonReader);
            case 6:
                int i5 = c.f9288a;
                bq bqVar = new bq();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName4 = jsonReader.nextName();
                    switch (strNextName4.hashCode()) {
                        case 3373707:
                            if (!strNextName4.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bqVar.c(jsonReader.nextString());
                                break;
                            }
                        case 3530753:
                            if (!strNextName4.equals("size")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bqVar.d(jsonReader.nextLong());
                                break;
                            }
                        case 3601339:
                            if (!strNextName4.equals("uuid")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bqVar.e(Base64.decode(jsonReader.nextString(), 2));
                                break;
                            }
                        case 1153765347:
                            if (!strNextName4.equals("baseAddress")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                bqVar.b(jsonReader.nextLong());
                                break;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return bqVar.a();
            case 7:
                int i6 = c.f9288a;
                ck ckVar2 = new ck();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    int iHashCode3 = strNextName5.hashCode();
                    if (iHashCode3 != -734768633) {
                        if (iHashCode3 == -567321830 && strNextName5.equals("contents")) {
                            ckVar2.e(Base64.decode(jsonReader.nextString(), 2));
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName5.equals("filename")) {
                        ckVar2.f(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return ckVar2.d();
            default:
                int i7 = c.f9288a;
                cj cjVar = new cj();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    switch (strNextName6.hashCode()) {
                        case -1536268810:
                            if (!strNextName6.equals("parameterKey")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                cjVar.b(jsonReader.nextString());
                                break;
                            }
                        case -1027290370:
                            if (!strNextName6.equals("templateVersion")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                cjVar.e(jsonReader.nextLong());
                                break;
                            }
                        case 1098747284:
                            if (!strNextName6.equals("rolloutVariant")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                ck ckVar3 = new ck();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    int iHashCode4 = strNextName7.hashCode();
                                    if (iHashCode4 != -82113408) {
                                        if (iHashCode4 == 551248556 && strNextName7.equals("rolloutId")) {
                                            ckVar3.b(jsonReader.nextString());
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName7.equals("variantId")) {
                                        ckVar3.c(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                cjVar.d(ckVar3.a());
                                break;
                            }
                            break;
                        case 1124454216:
                            if (!strNextName6.equals("parameterValue")) {
                                jsonReader.skipValue();
                                break;
                            } else {
                                cjVar.c(jsonReader.nextString());
                                break;
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return cjVar.a();
        }
    }
}
