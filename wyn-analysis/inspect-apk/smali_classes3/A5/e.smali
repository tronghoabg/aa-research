.class public final LA5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LA5/e;->a:I

    iput-object p1, p0, LA5/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA5/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA5/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LA5/e;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LA5/e;

    .line 12
    .line 13
    iget-object v0, v0, LA5/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/content/Context;

    .line 16
    .line 17
    new-instance v1, LVa/ka;

    .line 18
    .line 19
    const/16 v2, 0xf

    .line 20
    .line 21
    invoke-direct {v1, v2}, LVa/ka;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lza/a;

    .line 25
    .line 26
    const/16 v3, 0xe

    .line 27
    .line 28
    invoke-direct {v2, v3}, Lza/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lu5/d;

    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2}, Lu5/d;-><init>(Landroid/content/Context;LC5/a;LC5/a;)V

    .line 34
    .line 35
    .line 36
    return-object v3

    .line 37
    :pswitch_1
    iget-object v0, p0, LA5/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LA5/e;

    .line 40
    .line 41
    iget-object v0, v0, LA5/e;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/content/Context;

    .line 44
    .line 45
    sget v1, LA5/p;->d:I

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    new-instance v2, LA5/p;

    .line 56
    .line 57
    const-string v3, "com.google.android.datatransport.events"

    .line 58
    .line 59
    invoke-direct {v2, v0, v1, v3}, LA5/p;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_2
    iget-object v0, p0, LA5/e;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LA5/e;

    .line 66
    .line 67
    iget-object v0, v0, LA5/e;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 79
    .line 80
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
