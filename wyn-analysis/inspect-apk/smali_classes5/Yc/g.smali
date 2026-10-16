.class public final LYc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/v;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LYc/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Laa/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LYc/g;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, LYc/g;->b:Z

    .line 4
    iput-object p1, p0, LYc/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 2

    .line 1
    iget p2, p0, LYc/g;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, LYc/g;->b:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p2, :cond_4

    .line 10
    .line 11
    const/16 p2, 0x2644

    .line 12
    .line 13
    if-eq p1, p2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, LYc/g;->b:Z

    .line 18
    .line 19
    array-length p2, p3

    .line 20
    iget-object v1, p0, LYc/g;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Laa/f;

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    aget p2, p3, v0

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    array-length p2, p3

    .line 32
    if-le p2, p1, :cond_2

    .line 33
    .line 34
    aget p2, p3, p1

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    const-string p2, "AudioAccessDenied"

    .line 39
    .line 40
    const-string p3, "Audio access permission was denied."

    .line 41
    .line 42
    invoke-virtual {v1, p2, p3}, Laa/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    move v0, p1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/4 p2, 0x0

    .line 48
    invoke-virtual {v1, p2, p2}, Laa/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    :goto_1
    const-string p2, "CameraAccessDenied"

    .line 53
    .line 54
    const-string p3, "Camera access permission was denied."

    .line 55
    .line 56
    invoke-virtual {v1, p2, p3}, Laa/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    :goto_2
    return v0

    .line 61
    :pswitch_0
    iget-boolean p2, p0, LYc/g;->b:Z

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    if-eqz p2, :cond_6

    .line 65
    .line 66
    const/16 p2, 0xf0

    .line 67
    .line 68
    if-ne p1, p2, :cond_6

    .line 69
    .line 70
    iget-object p1, p0, LYc/g;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, LA5/h;

    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iput-boolean v0, p0, LYc/g;->b:Z

    .line 77
    .line 78
    array-length p2, p3

    .line 79
    const/4 v1, 0x1

    .line 80
    if-lez p2, :cond_5

    .line 81
    .line 82
    aget p2, p3, v0

    .line 83
    .line 84
    if-nez p2, :cond_5

    .line 85
    .line 86
    move v0, v1

    .line 87
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p3, p1, LA5/h;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p3, Ljava/util/HashMap;

    .line 94
    .line 95
    const-string v0, "authorizationStatus"

    .line 96
    .line 97
    invoke-virtual {p3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget-object p1, p1, LA5/h;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 103
    .line 104
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move v0, v1

    .line 108
    :cond_6
    return v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
