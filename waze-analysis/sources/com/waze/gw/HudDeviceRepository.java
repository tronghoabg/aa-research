package com.waze.gw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
final class HudDeviceRepository {
    static final String ACTIVE_FAMILY_KEY = "hud_link_active_family";
    private static final String PREFS = "waze_hud_gw";
    static final int TRANSPORT_AUTO = 0;
    static final int TRANSPORT_BLE = 2;
    static final int TRANSPORT_SPP = 1;
    static final int TRANSPORT_WS = 3;
    static final String VIETMAP_ADDRESS_KEY = "hud_link_vietmap_device_address";
    static final String VIETMAP_DETECTED_SERVICE_KEY = "hud_link_vietmap_detected_service";
    static final String VIETMAP_ENABLED_KEY = "hud_link_vietmap_enabled";
    static final String VIETMAP_FAMILY_KEY = "hud_link_protocol_family";
    static final String VIETMAP_NAME_KEY = "hud_link_vietmap_device_name";
    static final String VIETMAP_PROTOCOL_KEY = "hud_link_vietmap_protocol";
    static final String VIETMAP_TRANSPORT_KEY = "hud_link_vietmap_transport";
    static final int WS_DEFAULT_PORT = 8765;
    static final String WS_HOST_KEY = "hud_link_ws_host";
    static final String WS_PATH_KEY = "hud_link_ws_path";
    static final String WS_PORT_KEY = "hud_link_ws_port";
    private final SharedPreferences prefs;

    HudDeviceRepository(Context context) {
        this.prefs = context.getApplicationContext().getSharedPreferences(PREFS, 0);
    }

    String address() {
        return this.prefs.getString("hud_link_device_address", "");
    }

    String name() {
        return this.prefs.getString("hud_link_device_name", "");
    }

    int transport() {
        return this.prefs.getInt("hud_link_transport", 0);
    }

    String webSocketHost() {
        return this.prefs.getString(WS_HOST_KEY, "").trim();
    }

    int webSocketPort() {
        int i2 = this.prefs.getInt(WS_PORT_KEY, WS_DEFAULT_PORT);
        return (i2 < 1 || i2 > 65535) ? WS_DEFAULT_PORT : i2;
    }

    String webSocketPath() {
        String strTrim = this.prefs.getString(WS_PATH_KEY, "/hlp").trim();
        return strTrim.length() == 0 ? "/hlp" : strTrim.charAt(0) == '/' ? strTrim : DomExceptionUtils.SEPARATOR + strTrim;
    }

    String address(HudProtocolFamily hudProtocolFamily) {
        return isVietMap(hudProtocolFamily) ? vietMapAddress() : address();
    }

    String name(HudProtocolFamily hudProtocolFamily) {
        return isVietMap(hudProtocolFamily) ? vietMapName() : name();
    }

    int transport(HudProtocolFamily hudProtocolFamily) {
        return isVietMap(hudProtocolFamily) ? vietMapTransport() : transport();
    }

    int effectiveTransport(HudProtocolFamily hudProtocolFamily) {
        int iTransport = transport(hudProtocolFamily);
        if (iTransport != 0 || isVietMap(hudProtocolFamily)) {
            return iTransport;
        }
        return this.prefs.getInt("hud_link_device_transport", 1);
    }

    String vietMapAddress() {
        return this.prefs.getString(VIETMAP_ADDRESS_KEY, "");
    }

    String vietMapName() {
        return this.prefs.getString(VIETMAP_NAME_KEY, "");
    }

    int vietMapTransport() {
        return this.prefs.getInt(VIETMAP_TRANSPORT_KEY, 0);
    }

    String vietMapDetectedService() {
        return this.prefs.getString(VIETMAP_DETECTED_SERVICE_KEY, "");
    }

    String vietMapProtocol() {
        return this.prefs.getString(VIETMAP_PROTOCOL_KEY, "");
    }

    HudProtocolFamily vietMapExplicitFamily() {
        return HudProtocolFamily.fromPreference(this.prefs.getString(VIETMAP_FAMILY_KEY, TtmlNode.TEXT_EMPHASIS_AUTO));
    }

    HudProtocolFamily vietMapFamily() {
        return HudProtocolSelector.select(vietMapExplicitFamily(), Collections.singletonList(vietMapDetectedService()), vietMapTransport());
    }

    HudProtocolFamily protocolFamily() {
        return hasVietMapSelection() ? vietMapFamily() : address().length() == 0 ? HudProtocolFamily.AUTO : HudProtocolFamily.HLP1;
    }

    HudProtocolFamily activeFamily() {
        HudProtocolFamily hudProtocolFamilyFromPreference = HudProtocolFamily.fromPreference(this.prefs.getString(ACTIVE_FAMILY_KEY, HudProtocolFamily.HLP1.preferenceValue()));
        return hudProtocolFamilyFromPreference == HudProtocolFamily.AUTO ? HudProtocolFamily.HLP1 : hudProtocolFamilyFromPreference;
    }

    void setActiveFamily(HudProtocolFamily hudProtocolFamily) {
        if (hudProtocolFamily == null || hudProtocolFamily == HudProtocolFamily.AUTO) {
            hudProtocolFamily = HudProtocolFamily.HLP1;
        }
        this.prefs.edit().putString(ACTIVE_FAMILY_KEY, hudProtocolFamily.preferenceValue()).apply();
    }

    boolean isFamilyEnabled(HudProtocolFamily hudProtocolFamily) {
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50 || hudProtocolFamily == HudProtocolFamily.VIETMAP_H1) {
            return this.prefs.getBoolean(VIETMAP_ENABLED_KEY, false) && HudFeatureFlags.isRuntimeEnabled(hudProtocolFamily);
        }
        return this.prefs.getBoolean("hud_link", false);
    }

    boolean isActiveEnabled() {
        return isFamilyEnabled(activeFamily());
    }

    void setVietMapEnabled(boolean z) {
        this.prefs.edit().putBoolean(VIETMAP_ENABLED_KEY, z).apply();
    }

    boolean isVietMapEnabled() {
        return this.prefs.getBoolean(VIETMAP_ENABLED_KEY, false);
    }

    boolean hasSelection(HudProtocolFamily hudProtocolFamily) {
        return (hudProtocolFamily == HudProtocolFamily.HLP1 && effectiveTransport(hudProtocolFamily) == 3) ? webSocketHost().length() > 0 : address(hudProtocolFamily).length() > 0;
    }

    String detectedService() {
        return vietMapDetectedService();
    }

    private boolean hasVietMapSelection() {
        return vietMapAddress().length() > 0 || this.prefs.contains(VIETMAP_FAMILY_KEY) || vietMapDetectedService().length() > 0;
    }

    void selectVietMap(String str, String str2, int i2, HudProtocolFamily hudProtocolFamily, Iterable<String> iterable) {
        if (hudProtocolFamily == null) {
            hudProtocolFamily = HudProtocolFamily.AUTO;
        }
        String strDetectedService = HudProtocolSelector.detectedService(iterable, i2);
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        if (str == null) {
            str = "";
        }
        SharedPreferences.Editor editorPutString = editorEdit.putString(VIETMAP_ADDRESS_KEY, str);
        if (str2 == null) {
            str2 = "";
        }
        editorPutString.putString(VIETMAP_NAME_KEY, str2).putInt(VIETMAP_TRANSPORT_KEY, i2).putString(VIETMAP_FAMILY_KEY, hudProtocolFamily.preferenceValue()).putString(VIETMAP_DETECTED_SERVICE_KEY, strDetectedService).apply();
    }

    void selectVietMap(String str, String str2, int i2, String str3, Iterable<String> iterable) {
        selectVietMap(str, str2, i2, HudProtocolFamily.fromPreference(str3), iterable);
    }

    void setVietMapProtocol(String str) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        if (str == null) {
            str = "";
        }
        editorEdit.putString(VIETMAP_PROTOCOL_KEY, str).apply();
    }

    void forgetVietMap() {
        this.prefs.edit().remove(VIETMAP_ADDRESS_KEY).remove(VIETMAP_NAME_KEY).remove(VIETMAP_TRANSPORT_KEY).remove(VIETMAP_FAMILY_KEY).remove(VIETMAP_DETECTED_SERVICE_KEY).remove(VIETMAP_PROTOCOL_KEY).apply();
    }

    void select(String str, String str2, int i2) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        if (str == null) {
            str = "";
        }
        SharedPreferences.Editor editorPutString = editorEdit.putString("hud_link_device_address", str);
        if (str2 == null) {
            str2 = "";
        }
        editorPutString.putString("hud_link_device_name", str2).putInt("hud_link_device_transport", i2).putInt("hud_link_transport", i2).putBoolean("hud_link_migrated", true).apply();
    }

    void forget() {
        this.prefs.edit().remove("hud_link_device_address").remove("hud_link_device_name").remove("hud_link_device_transport").apply();
    }

    boolean migrateLegacyIfUnambiguous(BluetoothAdapter bluetoothAdapter) {
        String string;
        if (address().length() > 0 || this.prefs.getBoolean("hud_link_migrated", false) || (string = this.prefs.getString("hud_link_dev", "")) == null || string.trim().length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
            String strSafeAddress = safeAddress(bluetoothDevice);
            String strSafeName = safeName(bluetoothDevice);
            boolean z = "WazeHUD".equalsIgnoreCase(string) || string.endsWith(ProxyConfig.MATCH_ALL_SCHEMES);
            String strSubstring = string.endsWith(ProxyConfig.MATCH_ALL_SCHEMES) ? string.substring(0, string.length() - 1) : string;
            if (string.equalsIgnoreCase(strSafeAddress) || string.equals(strSafeName) || (z && strSafeName.startsWith(strSubstring))) {
                arrayList.add(bluetoothDevice);
            }
        }
        if (arrayList.size() != 1) {
            return false;
        }
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) arrayList.get(0);
        select(safeAddress(bluetoothDevice2), safeName(bluetoothDevice2), 1);
        return true;
    }

    BluetoothDevice selectedClassic(BluetoothAdapter bluetoothAdapter) {
        return selectedClassic(bluetoothAdapter, HudProtocolFamily.HLP1);
    }

    BluetoothDevice selectedClassic(BluetoothAdapter bluetoothAdapter, HudProtocolFamily hudProtocolFamily) {
        if (bluetoothAdapter == null) {
            return null;
        }
        String strAddress = address(hudProtocolFamily);
        if (strAddress.length() == 0) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
            if (strAddress.equalsIgnoreCase(safeAddress(bluetoothDevice))) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    private static boolean isVietMap(HudProtocolFamily hudProtocolFamily) {
        return hudProtocolFamily == HudProtocolFamily.VIETMAP_H50 || hudProtocolFamily == HudProtocolFamily.VIETMAP_H1;
    }

    static String safeAddress(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return "";
        }
        try {
            return String.valueOf(bluetoothDevice.getAddress());
        } catch (SecurityException e2) {
            return "";
        }
    }

    static String safeName(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return "";
        }
        try {
            return String.valueOf(bluetoothDevice.getName());
        } catch (SecurityException e2) {
            return "";
        }
    }
}
