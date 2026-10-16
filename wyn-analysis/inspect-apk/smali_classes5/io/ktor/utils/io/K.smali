.class public final synthetic Lio/ktor/utils/io/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/ktor/utils/io/m;


# direct methods
.method public synthetic constructor <init>(Lio/ktor/utils/io/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/ktor/utils/io/K;->a:I

    iput-object p1, p0, Lio/ktor/utils/io/K;->b:Lio/ktor/utils/io/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lio/ktor/utils/io/K;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/ktor/utils/io/K;->b:Lio/ktor/utils/io/m;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/ktor/utils/io/m;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lio/ktor/utils/io/K;->b:Lio/ktor/utils/io/m;

    .line 27
    .line 28
    iget-object v1, v0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
