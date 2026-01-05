package com.kiosk.mdm

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AdminReceiver : DeviceAdminReceiver() {

    // Chamado quando o Administrador de Dispositivo é ativado pelo usuário
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Toast.makeText(context, "Administrador de Dispositivo Ativado", Toast.LENGTH_SHORT).show()
    }

    // Chamado quando o Administrador de Dispositivo é desativado (com ou sem sucesso)
    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Toast.makeText(context, "Administrador de Dispositivo Desativado", Toast.LENGTH_SHORT).show()
    }
}
