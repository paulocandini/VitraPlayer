# Vitra Player

Player IPTV premium para Android e Android TV / Google TV.

## Funcionalidades

- Login por M3U/M3U8, Xtream Codes e MAC
- TV ao vivo, Filmes e Séries
- Player com ExoPlayer/Media3 (HLS, MPEG-TS, MP4)
- Favoritos, Continuar assistindo, PIN parental
- Identificador de dispositivo fixo
- Interface com identidade visual Vitra (ciano neon + gradiente)

## Como gerar o APK

### Opção 1 – Android Studio
1. Clone este repositório
2. Abra no Android Studio
3. Coloque a logo em `app/src/main/res/drawable/logo_vitra.png`
4. Build → Build APK(s)

### Opção 2 – GitHub Actions
1. Vá em **Actions** neste repositório
2. Rode o workflow **Build APK**
3. Baixe o artefato `vitra-player-apk`

## Requisitos
- Android Studio Ladybug ou mais recente
- minSdk 24 / targetSdk 35
- JDK 17

## Package
`com.vitra.player`
