package com.bytedance.sdk.openadsdk.orq;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private WeakReference<bcc> f26070oa;
    private Context uef;
    private Map<String, uef> yo = new HashMap();
    private SensorEventListener moa = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i5) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            bcc bccVarMoa;
            if (sensorEvent.sensor.getType() != 1 || (bccVarMoa = ivm.this.moa()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                bccVarMoa.uef("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener lw = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i5) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            bcc bccVarMoa;
            if (sensorEvent.sensor.getType() != 4 || (bccVarMoa = ivm.this.moa()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                bccVarMoa.uef("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener ivm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i5) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            bcc bccVarMoa;
            if (sensorEvent.sensor.getType() != 10 || (bccVarMoa = ivm.this.moa()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                bccVarMoa.uef("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener xs = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i5) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = zjm.f26090oa;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = zjm.yo;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = zjm.moa;
            SensorManager.getRotationMatrix(fArr5, null, zjm.f26090oa, zjm.yo);
            float[] fArr6 = zjm.lw;
            SensorManager.getOrientation(fArr5, fArr6);
            bcc bccVarMoa = ivm.this.moa();
            if (bccVarMoa == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                bccVarMoa.uef("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface uef {
        JSONObject uef(JSONObject jSONObject) throws Throwable;
    }

    public ivm(bcc bccVar) {
        this.uef = bccVar.uef();
        this.f26070oa = new WeakReference<>(bccVar);
        yo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.orq.uef lw() {
        bcc bccVarMoa = moa();
        if (bccVarMoa == null) {
            return null;
        }
        return bccVarMoa.bs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bcc moa() {
        WeakReference<bcc> weakReference = this.f26070oa;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void yo() {
        this.yo.put("adInfo", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.45
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                if (bccVarMoa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOib = bccVarMoa.oib();
                if (jSONObjectOib != null) {
                    jSONObjectOib.put("code", 1);
                    return jSONObjectOib;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.yo.put("appInfo", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.56
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = ivm.this.uef().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                bcc bccVarMoa = ivm.this.moa();
                if (bccVarMoa != null) {
                    jSONObject2.put("deviceId", bccVarMoa.xs());
                    jSONObject2.put("netType", bccVarMoa.ab());
                    jSONObject2.put("innerAppName", bccVarMoa.moa());
                    jSONObject2.put("appName", bccVarMoa.lw());
                    jSONObject2.put("appVersion", bccVarMoa.ivm());
                    Map<String, String> mapOa = bccVarMoa.oa();
                    for (String str : mapOa.keySet()) {
                        jSONObject2.put(str, mapOa.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.yo.put("playableSDKInfo", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.62
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.yo.put("subscribe_app_ad", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.63
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("download_app_ad", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.64
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("isViewable", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.2
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                if (bccVarMoa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", bccVarMoa.cz());
                return jSONObject3;
            }
        });
        this.yo.put("getVolume", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.3
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                if (bccVarMoa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", bccVarMoa.bcc());
                return jSONObject3;
            }
        });
        this.yo.put("getScreenSize", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.4
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                if (bccVarMoa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSy = bccVarMoa.sy();
                jSONObjectSy.put("code", 1);
                return jSONObjectSy;
            }
        });
        this.yo.put("start_accelerometer_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.5
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xs.uef("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                zjm.uef(ivm.this.uef, ivm.this.moa, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("close_accelerometer_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.6
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, ivm.this.moa);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("start_gyro_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.7
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xs.uef("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                zjm.oa(ivm.this.uef, ivm.this.lw, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("close_gyro_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.8
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, ivm.this.lw);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("start_accelerometer_grativityless_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.9
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xs.uef("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                zjm.yo(ivm.this.uef, ivm.this.ivm, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("close_accelerometer_grativityless_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.10
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, ivm.this.ivm);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("start_rotation_vector_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.11
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xs.uef("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                zjm.moa(ivm.this.uef, ivm.this.xs, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("close_rotation_vector_observer", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.13
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, ivm.this.xs);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("device_shake", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.14
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("device_shake_short", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.15
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    zjm.uef(ivm.this.uef, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xs.uef("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.yo.put("playable_style", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.16
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectYo = bccVarMoa.yo();
                jSONObjectYo.put("code", 1);
                return jSONObjectYo;
            }
        });
        this.yo.put("sendReward", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.17
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.tpx();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playableInteractionTriggered", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.18
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.orq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("webview_time_track", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.19
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.yo.put("playable_event", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.20
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.oa(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("reportAd", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.21
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("close", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.22
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("openAdLandPageLinks", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.24
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("get_viewport", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.25
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectDhk = bccVarMoa.dhk();
                jSONObjectDhk.put("code", 1);
                return jSONObjectDhk;
            }
        });
        this.yo.put("jssdk_load_finish", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.26
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.fz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_material_render_result", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.27
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.cz(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("detect_change_playable_click", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.28
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectZjm = bccVarMoa.zjm();
                jSONObjectZjm.put("code", 1);
                return jSONObjectZjm;
            }
        });
        this.yo.put("check_camera_permission", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.29
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectCq = bccVarMoa.cq();
                jSONObjectCq.put("code", 1);
                return jSONObjectCq;
            }
        });
        this.yo.put("check_external_storage", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.30
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectDz = bccVarMoa.dz();
                if (jSONObjectDz.isNull("result")) {
                    jSONObjectDz.put("code", -1);
                    return jSONObjectDz;
                }
                jSONObjectDz.put("code", 1);
                return jSONObjectDz;
            }
        });
        this.yo.put("playable_open_camera", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.31
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_pick_photo", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.32
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_download_media_in_photos", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.33
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.uef(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_preventTouchEvent", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.35
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.oa(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_settings_info", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.36
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWk = bccVarMoa.wk();
                jSONObjectWk.put("code", 1);
                return jSONObjectWk;
            }
        });
        this.yo.put("playable_load_main_scene", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.37
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.gzw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_enter_section", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.38
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.moa(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_end", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.39
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.gsd();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_finish_play_playable", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.40
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.rt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_transfrom_module_show", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.41
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.gr();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_transfrom_module_change_color", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.42
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.ue();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_set_scroll_rect", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.43
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_click_area", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.44
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.lw(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_real_play_start", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.46
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_material_first_frame_show", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.47
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.pz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_stuck_check_pong", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.48
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.cp();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_material_adnormal_mask", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.49
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                bccVarMoa.ivm(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_long_press_panel", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.50
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_alpha_player_play", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.51
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_transfrom_module_highlight", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.52
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_send_click_event", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.53
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_query_media_permission_declare", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.54
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXs = bccVarMoa.xs(jSONObject);
                jSONObjectXs.put("code", 1);
                return jSONObjectXs;
            }
        });
        this.yo.put("playable_query_media_permission_enable", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.55
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                bcc bccVarMoa = ivm.this.moa();
                JSONObject jSONObject2 = new JSONObject();
                if (bccVarMoa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBcc = bccVarMoa.bcc(jSONObject);
                jSONObjectBcc.put("code", 1);
                return jSONObjectBcc;
            }
        });
        this.yo.put("playable_apply_media_permission", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.57
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_start_kws", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.58
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_close_kws", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.59
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_video_preload_task_add", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.60
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.yo.put("playable_video_preload_task_cancel", new uef() { // from class: com.bytedance.sdk.openadsdk.orq.ivm.61
            @Override // com.bytedance.sdk.openadsdk.orq.ivm.uef
            public JSONObject uef(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.orq.uef uefVarLw = ivm.this.lw();
                JSONObject jSONObject2 = new JSONObject();
                if (uefVarLw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    public void oa() {
        zjm.uef(this.uef, this.moa);
        zjm.uef(this.uef, this.lw);
        zjm.uef(this.uef, this.ivm);
        zjm.uef(this.uef, this.xs);
    }

    public Set<String> uef() {
        return this.yo.keySet();
    }

    public JSONObject uef(String str, JSONObject jSONObject) {
        try {
            uef uefVar = this.yo.get(str);
            if (uefVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return uefVar.uef(jSONObject);
        } catch (Throwable th) {
            xs.uef("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
