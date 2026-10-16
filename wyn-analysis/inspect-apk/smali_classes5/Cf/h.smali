.class public final LCf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCf/i;


# static fields
.field public static final b:LCf/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LCf/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LCf/h;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LCf/h;->b:LCf/h;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LCf/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LCf/g;
    .locals 3

    .line 1
    invoke-static {}, LCf/e;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, LCf/g;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, LCf/g;-><init>(J)V

    .line 8
    .line 9
    .line 10
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LCf/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    sget v0, LCf/e;->b:I

    .line 12
    .line 13
    const-string v0, "TimeSource(System.nanoTime())"

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
