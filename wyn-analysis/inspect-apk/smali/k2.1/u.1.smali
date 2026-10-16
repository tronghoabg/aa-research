.class public final synthetic Lk2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:LS3/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;LS3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lk2/u;->a:I

    iput-object p1, p0, Lk2/u;->b:Ljava/lang/Class;

    iput-object p2, p0, Lk2/u;->c:LS3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk2/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk2/u;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iget-object v1, p0, Lk2/u;->c:LS3/c;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lk2/v;->d(Ljava/lang/Class;LS3/c;)Lk2/G;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lk2/u;->b:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object v1, p0, Lk2/u;->c:LS3/c;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lk2/v;->d(Ljava/lang/Class;LS3/c;)Lk2/G;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lk2/u;->b:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v1, p0, Lk2/u;->c:LS3/c;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lk2/v;->d(Ljava/lang/Class;LS3/c;)Lk2/G;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
