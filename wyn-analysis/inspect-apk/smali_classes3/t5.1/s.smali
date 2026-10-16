.class public final Lt5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lv5/b;

.field public final c:Ldf/a;

.field public final d:Lv5/b;


# direct methods
.method public synthetic constructor <init>(Lv5/b;Ldf/a;Lv5/b;I)V
    .locals 0

    .line 1
    iput p4, p0, Lt5/s;->a:I

    iput-object p1, p0, Lt5/s;->b:Lv5/b;

    iput-object p2, p0, Lt5/s;->c:Ldf/a;

    iput-object p3, p0, Lt5/s;->d:Lv5/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lt5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt5/s;->b:Lv5/b;

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
    iget-object v1, p0, Lt5/s;->c:Ldf/a;

    .line 15
    .line 16
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LA5/d;

    .line 21
    .line 22
    iget-object v2, p0, Lt5/s;->d:Lv5/b;

    .line 23
    .line 24
    check-cast v2, Lt5/n;

    .line 25
    .line 26
    invoke-virtual {v2}, Lt5/n;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lz5/a;

    .line 31
    .line 32
    new-instance v3, Lz5/c;

    .line 33
    .line 34
    invoke-direct {v3, v0, v1, v2}, Lz5/c;-><init>(Landroid/content/Context;LA5/d;Lz5/a;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_0
    new-instance v5, LVa/ka;

    .line 39
    .line 40
    const/16 v0, 0xf

    .line 41
    .line 42
    invoke-direct {v5, v0}, LVa/ka;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lza/a;

    .line 46
    .line 47
    const/16 v0, 0xe

    .line 48
    .line 49
    invoke-direct {v6, v0}, Lza/a;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lt5/s;->b:Lv5/b;

    .line 53
    .line 54
    check-cast v0, Ly5/b;

    .line 55
    .line 56
    invoke-virtual {v0}, Ly5/b;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v7, v0

    .line 61
    check-cast v7, Ly5/c;

    .line 62
    .line 63
    iget-object v0, p0, Lt5/s;->c:Ldf/a;

    .line 64
    .line 65
    check-cast v0, Lz5/g;

    .line 66
    .line 67
    invoke-virtual {v0}, Lz5/g;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v8, v0

    .line 72
    check-cast v8, Lz5/f;

    .line 73
    .line 74
    iget-object v0, p0, Lt5/s;->d:Lv5/b;

    .line 75
    .line 76
    check-cast v0, Lz5/i;

    .line 77
    .line 78
    invoke-virtual {v0}, Lz5/i;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v9, v0

    .line 83
    check-cast v9, Lz5/h;

    .line 84
    .line 85
    new-instance v4, Lt5/r;

    .line 86
    .line 87
    invoke-direct/range {v4 .. v9}, Lt5/r;-><init>(LC5/a;LC5/a;Ly5/c;Lz5/f;Lz5/h;)V

    .line 88
    .line 89
    .line 90
    return-object v4

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
