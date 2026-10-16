.class public final synthetic LE5/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LE5/J;->a:I

    iput-object p1, p0, LE5/J;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LE5/J;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE5/J;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LU1/z;

    .line 9
    .line 10
    iget-boolean v0, v0, LU1/z;->C:Z

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    iget-object v0, p0, LE5/J;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lk2/G;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, LE5/J;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Leb/a;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_2
    iget-object v0, p0, LE5/J;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LU1/h;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_3
    iget-object v0, p0, LE5/J;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LE5/O;

    .line 35
    .line 36
    iget-boolean v0, v0, LE5/O;->y:Z

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
