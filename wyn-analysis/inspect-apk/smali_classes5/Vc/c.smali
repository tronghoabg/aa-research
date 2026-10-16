.class public final synthetic LVc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/l;
.implements Lw4/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Luc/h;


# direct methods
.method public synthetic constructor <init>(Luc/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LVc/c;->a:I

    iput-object p1, p0, LVc/c;->b:Luc/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVc/c;->b:Luc/h;

    .line 2
    .line 3
    iget v1, p0, LVc/c;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lgc/b;->M(Landroid/location/Location;)Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    sget v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:I

    .line 17
    .line 18
    invoke-static {p1}, Lgc/b;->M(Landroid/location/Location;)Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onError(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LVc/c;->b:Luc/h;

    .line 3
    .line 4
    iget v2, p0, LVc/c;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lpd/f;->h(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p1}, Lpd/f;->g(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, v2, p1, v0}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sget v2, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:I

    .line 22
    .line 23
    invoke-static {p1}, Lpd/f;->h(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p1}, Lpd/f;->g(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, v2, p1, v0}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
