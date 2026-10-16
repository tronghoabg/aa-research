package com.unity3d.services.core.device.reader;

import cb.AbstractC1593a;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapL = AbstractC1593a.l("platform", "android");
        mapL.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        mapL.put("sdkVersionName", SdkProperties.getVersionName());
        mapL.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        mapL.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapL.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapL.put(AndroidGetAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return mapL;
    }
}
