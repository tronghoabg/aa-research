.class public final LA5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lv5/b;

.field public final c:Ldf/a;


# direct methods
.method public synthetic constructor <init>(Lv5/b;Ldf/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LA5/n;->a:I

    iput-object p1, p0, LA5/n;->b:Lv5/b;

    iput-object p2, p0, LA5/n;->c:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LA5/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA5/n;->b:Lv5/b;

    .line 7
    .line 8
    check-cast v0, LA5/e;

    .line 9
    .line 10
    iget-object v0, v0, LA5/e;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, LA5/n;->c:Ldf/a;

    .line 15
    .line 16
    check-cast v1, LA5/e;

    .line 17
    .line 18
    invoke-virtual {v1}, LA5/e;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lu5/e;

    .line 23
    .line 24
    check-cast v1, Lu5/d;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lu5/e;-><init>(Landroid/content/Context;Lu5/d;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    new-instance v4, LVa/ka;

    .line 31
    .line 32
    const/16 v0, 0xf

    .line 33
    .line 34
    invoke-direct {v4, v0}, LVa/ka;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lza/a;

    .line 38
    .line 39
    const/16 v0, 0xe

    .line 40
    .line 41
    invoke-direct {v5, v0}, Lza/a;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sget-object v6, LA5/a;->f:LA5/a;

    .line 45
    .line 46
    iget-object v0, p0, LA5/n;->b:Lv5/b;

    .line 47
    .line 48
    check-cast v0, LA5/e;

    .line 49
    .line 50
    invoke-virtual {v0}, LA5/e;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v3, LA5/m;

    .line 55
    .line 56
    move-object v7, v0

    .line 57
    check-cast v7, LA5/p;

    .line 58
    .line 59
    iget-object v8, p0, LA5/n;->c:Ldf/a;

    .line 60
    .line 61
    invoke-direct/range {v3 .. v8}, LA5/m;-><init>(LC5/a;LC5/a;LA5/a;LA5/p;Ldf/a;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
