package com.waze.jni.protos.places;

import com.waze.jni.protos.places.Address;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AddressKt {
    public static final AddressKt INSTANCE = new AddressKt();

    private AddressKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Address.Builder _builder;

        private Dsl(Address.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Address _build() {
            Address addressBuild = this._builder.build();
            x.e(addressBuild, "build(...)");
            return addressBuild;
        }

        public final void clearCity() {
            this._builder.clearCity();
        }

        public final void clearCountry() {
            this._builder.clearCountry();
        }

        public final void clearHouseNumber() {
            this._builder.clearHouseNumber();
        }

        public final void clearState() {
            this._builder.clearState();
        }

        public final void clearStreet() {
            this._builder.clearStreet();
        }

        public final void clearZip() {
            this._builder.clearZip();
        }

        public final String getCity() {
            String city = this._builder.getCity();
            x.e(city, "getCity(...)");
            return city;
        }

        public final String getCountry() {
            String country = this._builder.getCountry();
            x.e(country, "getCountry(...)");
            return country;
        }

        public final String getHouseNumber() {
            String houseNumber = this._builder.getHouseNumber();
            x.e(houseNumber, "getHouseNumber(...)");
            return houseNumber;
        }

        public final String getState() {
            String state = this._builder.getState();
            x.e(state, "getState(...)");
            return state;
        }

        public final String getStreet() {
            String street = this._builder.getStreet();
            x.e(street, "getStreet(...)");
            return street;
        }

        public final String getZip() {
            String zip = this._builder.getZip();
            x.e(zip, "getZip(...)");
            return zip;
        }

        public final void setCity(String str) {
            x.f(str, "value");
            this._builder.setCity(str);
        }

        public final void setCountry(String str) {
            x.f(str, "value");
            this._builder.setCountry(str);
        }

        public final void setHouseNumber(String str) {
            x.f(str, "value");
            this._builder.setHouseNumber(str);
        }

        public final void setState(String str) {
            x.f(str, "value");
            this._builder.setState(str);
        }

        public final void setStreet(String str) {
            x.f(str, "value");
            this._builder.setStreet(str);
        }

        public final void setZip(String str) {
            x.f(str, "value");
            this._builder.setZip(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Address.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Address.Builder builder, o oVar) {
            this(builder);
        }
    }
}
