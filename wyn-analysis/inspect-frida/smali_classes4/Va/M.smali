.class public final LVa/M;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/N;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LVa/M;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/N;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LVa/M;->c:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVa/M;->d:LVa/N;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/M;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/M;->d:LVa/N;

    .line 7
    .line 8
    iget-object v0, v0, LVa/N;->i:LVa/V;

    .line 9
    .line 10
    invoke-static {v0}, LVa/V;->g(LVa/V;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, LVa/v;

    .line 17
    .line 18
    const/16 v1, 0xb

    .line 19
    .line 20
    invoke-direct {v0, v1}, LVa/v;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, LVa/G;->E()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    int-to-long v1, v1

    .line 34
    invoke-static {v0, v1, v2}, LVa/Cb;->a(LVa/Ba;J)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, LVa/M;->d:LVa/N;

    .line 39
    .line 40
    iget-object v1, v0, LVa/N;->g:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    iget-object v2, v0, LVa/N;->h:LVa/v;

    .line 43
    .line 44
    iget-object v3, v0, LVa/N;->i:LVa/V;

    .line 45
    .line 46
    iget-object v0, v0, LVa/N;->d:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v3, v0, v1, v2}, LVa/V;->O(LVa/V;Landroid/content/Context;Ljava/util/LinkedHashMap;LVa/v;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
